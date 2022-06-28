package br.com.jhonatas.forum.mapper

import br.com.jhonatas.forum.dto.TopicoForm
import br.com.jhonatas.forum.model.Topico
import br.com.jhonatas.forum.service.CursoService
import br.com.jhonatas.forum.service.UsuarioService
import org.springframework.stereotype.Component

@Component
class TopicoFormMapper(
    private val cursoService: CursoService,
    private val usuarioService: UsuarioService
): Mapper<TopicoForm, Topico> {
    override fun mapper(t: TopicoForm): Topico {
       return Topico(
            titulo = t.titulo,
            mensagem = t.mensagem,
            curso = cursoService.buscarPorId(t.idCurso),
            autor = usuarioService.buscarPorId(t.idUsuario)
        )
    }

}
