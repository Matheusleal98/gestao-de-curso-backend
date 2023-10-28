package com.example.studentcode.controller

import com.example.studentcode.entity.Instrutor
import com.example.studentcode.service.InstrutorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/instrutor")
class InstrutorController {

    @Autowired
    private lateinit var instrutorService: InstrutorService

    @PutMapping("/edit/{id}")
    fun editarInstrutor(@RequestBody instrutor: Instrutor, @PathVariable id: Long) {
        instrutorService.editarInstrutor(instrutor, id)
    }

    @DeleteMapping("/{id}")
    fun deletarInstrutor(@PathVariable id: Long) {
        instrutorService.deletarInstrutor(id)
    }

    @GetMapping("/find/{id}")
    fun listarInstrutorPorChavePrimaria(@PathVariable id:Long): Instrutor? {
        return instrutorService.listarInstrutorPorChavePrimaria(id)
    }

    @GetMapping
    fun listarInstrutoresCadastrados(): MutableList<Instrutor> {
        return instrutorService.listarInstrutoresCadastrados()
    }

    @PostMapping
    fun obterCadastroInstrutor(@RequestBody instrutor: Instrutor): Instrutor {
        return instrutorService.obterCadastroInstrutor(instrutor)
    }
}