package br.com.jhonatas.forum.model

import java.time.LocalDateTime
import java.util.*

data class Topico(
        val id: Long? = null,
        val titulo: String,
        val mensagem: LocalDateTime = LocalDateTime.now(),
        val curso: Curso,
        val autor: Usuario,
        val status: StatusTopico = StatusTopico.NAO_RESPONDIDO,
        val respostas: List<Resposta> = ArrayList()
)

