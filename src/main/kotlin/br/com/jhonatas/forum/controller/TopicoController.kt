package br.com.jhonatas.forum.controller

import br.com.jhonatas.forum.dto.TopicoForm
import br.com.jhonatas.forum.dto.TopicoView
import br.com.jhonatas.forum.model.Topico
import br.com.jhonatas.forum.service.TopicoService
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/topicos")
class TopicoController(private val service: TopicoService) {

    @GetMapping
    fun listar(): List<TopicoView>{
        return service.listar()
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): TopicoView {
        return service.buscarPorId(id)
    }

    @PostMapping
    fun cadastrar(@RequestBody @Valid dto: TopicoForm) {
        service.cadastrar(dto)
    }
}
