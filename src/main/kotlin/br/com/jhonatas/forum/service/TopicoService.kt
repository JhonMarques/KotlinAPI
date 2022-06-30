package br.com.jhonatas.forum.service

import br.com.jhonatas.forum.dto.AtualizacaoTopicoForm
import br.com.jhonatas.forum.dto.TopicoForm
import br.com.jhonatas.forum.dto.TopicoView
import br.com.jhonatas.forum.mapper.TopicoFormMapper
import br.com.jhonatas.forum.mapper.TopicoViewMapper
import br.com.jhonatas.forum.model.Topico
import org.springframework.stereotype.Service
import java.util.*
import java.util.stream.Collectors


@Service
class TopicoService(
    private var topicos: List<Topico> = ArrayList(),
    private val topicoViewMapper: TopicoViewMapper,
    private val topicoFormMapper: TopicoFormMapper
    ){

    fun listar(): List<TopicoView>{
        return topicos.stream().map {
            t -> topicoViewMapper.mapper(t)
        }.collect(Collectors.toList())
    }

    fun buscarPorId(id: Long): TopicoView {
        val topico =  topicos.stream().filter { t ->
            t.id == id
        }.findFirst().get()
        return topicoViewMapper.mapper(topico)
    }

    fun cadastrar(form: TopicoForm): TopicoView {
        val topico = topicoFormMapper.mapper(form)
        topico.id = topicos.size.toLong() + 1
        topicos = topicos.plus(topico)

        return topicoViewMapper.mapper(topico)
    }

    fun atualizar(form: AtualizacaoTopicoForm): TopicoView {
        val topico = topicos.stream().filter{ t ->
            t.id == form.id
        }.findFirst().get()

        val topicoAtualizado = Topico(
            id = form.id,
            titulo = form.titulo,
            mensagem = form.mensagem,
            autor = topico.autor,
            curso = topico.curso,
            respostas = topico.respostas,
            status = topico.status,
            dataCriacao = topico.dataCriacao
        )
        topicos = topicos.minus(topico).plus(topicoAtualizado)
        return topicoViewMapper.mapper(topicoAtualizado)
    }

    fun deletar(id: Long) {
        val topico = topicos.stream().filter{ t ->
            t.id == id
        }.findFirst().get()
        topicos = topicos.minus(topico)
    }


}
