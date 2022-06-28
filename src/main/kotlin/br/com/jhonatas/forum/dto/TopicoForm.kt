package br.com.jhonatas.forum.dto

data class TopicoDTO (
    val titulo: String,
    val mensagem: String,
    val idCurso: Long,
    val idUsuario: Long
)
