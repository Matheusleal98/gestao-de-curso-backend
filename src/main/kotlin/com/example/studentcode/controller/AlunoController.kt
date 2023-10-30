package com.example.studentcode.controller

import com.example.studentcode.entity.Aluno
import com.example.studentcode.service.AlunoService
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
@RequestMapping("/aluno")
class AlunoController {

    @Autowired
    private lateinit var alunoService: AlunoService

    @DeleteMapping("/{id}")
    fun deletarAluno(@PathVariable id: Long) {
        alunoService.deletarAluno(id)
    }

    @PutMapping("/edit/{id}")
    fun editarAluno(@RequestBody aluno: Aluno, @PathVariable id: Long) {
        alunoService.editarAluno(aluno,id)
    }

    @GetMapping
    fun listarAlunosCadastrados(): MutableList<Aluno> {
        return alunoService.listarAlunosCadastrados();
    }

    @GetMapping("/find/{id}")
    fun listarAlunoPorChavePrimaria(@PathVariable id: Long): Aluno? {
        return alunoService.listarAlunoPorChavePrimaria(id)
    }

    @PostMapping
    fun obterCadastroAluno(@RequestBody aluno: Aluno): Aluno {
        return alunoService.obterCadastroAluno(aluno)
    }
}