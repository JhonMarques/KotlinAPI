package br.com.jhonatas.forum.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class AtualizacaoTopicoForm (

    @field:NotNull(message = "O ID não pode ser vazio ")
    val id: Long,

    @field:NotEmpty(message = "O título não deve ser menor que 5 caracteres")
    @field:Size(min = 5, max = 100)
    val titulo: String,

    @field:NotEmpty(message = "A mensagem não deve ser menor que 5 caracteres")
    @field:Size(min = 5, max = 300)
    val mensagem: String
)
