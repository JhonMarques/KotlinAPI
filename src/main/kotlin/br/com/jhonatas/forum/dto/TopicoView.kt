package br.com.jhonatas.forum.dto

import br.com.jhonatas.forum.model.StatusTopico
import java.time.LocalDateTime

data class TopicoView (

    val id: Long?,
    val titulo: String,
    val mensagem: String,
    val status: StatusTopico,
    val dataCriacao: LocalDateTime

    )
