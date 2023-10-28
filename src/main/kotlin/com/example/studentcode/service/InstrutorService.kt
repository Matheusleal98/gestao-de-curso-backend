package com.example.studentcode.service

import com.example.studentcode.entity.Instrutor
import com.example.studentcode.repository.InstrutorRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class InstrutorService {

    @Autowired
    private lateinit var instrutorRepository: InstrutorRepository

    fun editarInstrutor(instrutor: Instrutor, id: Long): Instrutor {
        return instrutorRepository.findById(id)
            .map { instrutorExistente ->
                instrutorExistente.nome = instrutor.nome
                instrutorExistente.email = instrutor.email
                instrutorExistente.especializacao = instrutor.especializacao
                instrutorRepository.save(instrutorExistente)
            }
            .orElseGet{
                instrutor.id = id
                this.obterCadastroInstrutor(instrutor)
                instrutorRepository.save(instrutor)
            }
    }

    fun deletarInstrutor(id: Long) {
        instrutorRepository.deleteById(id)
    }
    fun listarInstrutoresCadastrados(): MutableList<Instrutor> {
        return instrutorRepository.findAll()
    }

    fun listarInstrutorPorChavePrimaria(id: Long): Instrutor? {
        val pesquisaInstrutor = instrutorRepository.findById(id)
        if (pesquisaInstrutor.isPresent){
            return pesquisaInstrutor.get()
        }
        return null;
    }

    fun obterCadastroInstrutor(instrutor: Instrutor): Instrutor {
        val instrutor = mapperTo(instrutor)
        return instrutorRepository.save(instrutor)
    }

    private fun mapperTo(instrutor: Instrutor): Instrutor {
        val novoInstrutor = Instrutor()
        novoInstrutor.nome = instrutor.nome
        novoInstrutor.email = instrutor.email
        novoInstrutor.especializacao = instrutor.especializacao
        return novoInstrutor
    }
}