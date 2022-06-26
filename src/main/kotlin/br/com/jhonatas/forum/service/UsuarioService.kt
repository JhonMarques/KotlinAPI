package br.com.jhonatas.forum.service

import br.com.jhonatas.forum.model.Curso
import br.com.jhonatas.forum.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class UsuarioService(var usuarios: List<Usuario>) {

    init {
        val usuario = Usuario(
            id = 1,
            nome = "Jhonatas",
            email = "teste@gmail.com"
        )
        usuarios = Arrays.asList(usuario)
    }

    fun listar(): List<Usuario> {
        return usuarios
    }

    fun buscarPorId(id: Long): Usuario {
        return usuarios.stream()
            .filter({
                c -> c.id == id
            }).findFirst().get()
    }

}
