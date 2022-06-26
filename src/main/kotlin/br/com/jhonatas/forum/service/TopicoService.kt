package br.com.jhonatas.forum.service

import br.com.jhonatas.forum.dto.TopicoDTO
import br.com.jhonatas.forum.model.Curso
import br.com.jhonatas.forum.model.Topico
import br.com.jhonatas.forum.model.Usuario
import org.springframework.stereotype.Service
import java.util.*


@Service
class TopicoService(
    private var topicos: List<Topico> = ArrayList(),
    private val cursoService: CursoService,
    private val usuarioService: UsuarioService
    ){

    fun listar(): List<Topico>{
        return topicos
    }

    fun buscarPorId(id: Long): Topico {
        return topicos.stream().filter({
            t -> t.id == id
        }).findFirst().get()
    }

    fun cadastrar(dto: TopicoDTO) {
       topicos = topicos.plus(Topico(
            id = topicos.size.toLong() + 1,
            titulo = dto.titulo,
            mensagem = dto.mensagem,
            curso = cursoService.buscarPorId(dto.idCurso),
            autor = usuarioService.buscarPorId(dto.idUsuario)
        ))
    }
}
