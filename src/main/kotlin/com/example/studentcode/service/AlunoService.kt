package com.example.studentcode.service

import com.example.studentcode.dto.AlunoDTO
import com.example.studentcode.entity.Aluno
import com.example.studentcode.repository.AlunoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AlunoService {

    @Autowired
    private lateinit var alunoRepository: AlunoRepository

    private fun mapperTo(dto: AlunoDTO): Aluno {
        val aluno = Aluno()
        aluno.ra = dto.ra
        aluno.nome = dto.nome
        aluno.email = dto.email
        aluno.dtNascimento = dto.dtNascimento
        return aluno
    }

    fun listarAlunosCadastrados(): MutableList<Aluno> {
        return alunoRepository.findAll()
    }
}