package br.com.jhonatas.forum.model

import java.time.LocalDateTime
import java.util.*

data class Topico(
    var id: Long? = null,
    val titulo: String,
    val mensagem: String,
    val curso: Curso,
    val autor: Usuario,
    val status: StatusTopico = StatusTopico.NAO_RESPONDIDO,
    val dataCriacao: LocalDateTime = LocalDateTime.now(),
    val respostas: List<Resposta> = ArrayList()
)

