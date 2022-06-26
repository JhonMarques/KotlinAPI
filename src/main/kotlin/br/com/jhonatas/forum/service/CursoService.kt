package br.com.jhonatas.forum.service

import br.com.jhonatas.forum.model.Curso
import br.com.jhonatas.forum.model.Topico
import org.springframework.stereotype.Service
import java.util.*

@Service
class CursoService(var cursos: List<Curso>) {

    init {
        val curso = Curso(
            id = 1,
            nome = "Kotlin",
            categoria = "Backend"
        )
            cursos = Arrays.asList(curso)
    }

    fun listar(): List<Curso> {
        return cursos
    }

    fun buscarPorId(id: Long): Curso {
       return cursos.stream()
            .filter({
                c -> c.id == id
            }).findFirst().get()
    }

    fun cadastrar(curso: Curso){
        cursos.plus(curso)
    }

}
