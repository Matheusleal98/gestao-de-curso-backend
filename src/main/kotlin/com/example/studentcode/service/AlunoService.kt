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

    fun criarAluno(dto: AlunoDTO): Aluno {
        val aluno = mapperTo(dto)
        return alunoRepository.save(aluno)
    }

    private fun mapperTo(dto: AlunoDTO): Aluno {
        val aluno = Aluno()
        aluno.nome = dto.nome
        aluno.email = dto.email
        aluno.dt_nascimento = dto.dt_nascimento
        aluno.ra = dto.ra
        return aluno
    }
}