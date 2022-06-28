package br.com.jhonatas.forum.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class TopicoForm (

    @field:NotEmpty(message = "O título não deve ser menor que 5 caracteres")
    @field:Size(min = 5, max = 100)
    val titulo: String,

    @field:NotEmpty(message = "A mensagem não deve ser menor que 5 caracteres")
    @field:Size(min = 5, max = 300)
    val mensagem: String,

    @field:NotNull(message = "O campo curso não pode ser vazio")
    val idCurso: Long,

    @field:NotNull(message = "O campo usuário não pode ser vazio")
    val idUsuario: Long
)
