package com.example.studentcode.controller

import com.example.studentcode.dto.AlunoDTO
import com.example.studentcode.entity.Aluno
import com.example.studentcode.service.AlunoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/admin/aluno")
class AlunoController {

    private lateinit var alunoService: AlunoService

    @GetMapping("/list")
    fun listarAlunosCadastrados(): MutableList<Aluno> {
        return alunoService.listarAlunosCadastrados();
    }
}