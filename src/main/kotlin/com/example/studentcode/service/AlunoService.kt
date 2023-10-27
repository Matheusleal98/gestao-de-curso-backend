package com.example.studentcode.service

import com.example.studentcode.entity.Aluno
import com.example.studentcode.repository.AlunoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AlunoService {

    @Autowired
    private lateinit var alunoRepository: AlunoRepository

    fun listarAlunosCadastrados(): MutableList<Aluno> {
        return alunoRepository.findAll()
    }

    fun obterCadastroAluno(aluno: Aluno): Aluno {
        val aluno = mapperTo(aluno)
        return alunoRepository.save(aluno)
    }

    private fun mapperTo(aluno: Aluno): Aluno {
        val novoAluno = Aluno()
        novoAluno.ra = aluno.ra
        novoAluno.nome = aluno.nome
        novoAluno.email = aluno.email
        novoAluno.dtNascimento = aluno.dtNascimento
        return novoAluno
    }

    fun listarAlunoPorChavePrimaria(id: Long): Aluno? {
        val pesquisarAluno = alunoRepository.findById(id)
        if (pesquisarAluno.isPresent){
            return pesquisarAluno.get()
        }
        return null;
    }

    fun editarAluno(aluno: Aluno, id: Long): Aluno {
        return alunoRepository.findById(id)
            .map { existeAluno ->
                existeAluno.ra = aluno.ra
                existeAluno.nome = aluno.nome
                existeAluno.email = aluno.email
                existeAluno.dtNascimento = aluno.dtNascimento
                alunoRepository.save(existeAluno)
            }
            .orElseGet {
                val novoAluno = Aluno()
                novoAluno.id = id
                this.obterCadastroAluno(aluno)
                alunoRepository.save(novoAluno)
            }
    }

    fun deletarAluno(id: Long) {
        alunoRepository.deleteById(id)
    }
}