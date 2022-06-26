package br.com.jhonatas.forum.controller

import br.com.jhonatas.forum.dto.TopicoDTO
import br.com.jhonatas.forum.model.Topico
import br.com.jhonatas.forum.service.TopicoService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/topicos")
class TopicoController(private val service: TopicoService) {

    @GetMapping
    fun listar(): List<Topico>{
        return service.listar()
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): Topico{
        return service.buscarPorId(id)
    }

    @PostMapping
    fun cadastrar(@RequestBody dto: TopicoDTO) {
        service.cadastrar(dto)
    }
}
