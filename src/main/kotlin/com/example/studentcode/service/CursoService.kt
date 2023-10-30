package com.example.studentcode.service

import com.example.studentcode.entity.Curso
import com.example.studentcode.repository.CursoRepository
import jakarta.persistence.Id
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CursoService {

    @Autowired
    private lateinit var cursoRepository: CursoRepository
    @Autowired
    private lateinit var instrutorService: InstrutorService

    fun deletarCurso(id: Long) {
        cursoRepository.deleteById(id)
    }

    fun listarCursosCadastrados(): MutableList<Curso> {
        return cursoRepository.findAll()
    }

    fun listarCursoPorChavePrimaria(id: Long): Curso? {
        val curso = cursoRepository.findById(id)
        if (curso.isPresent){
            return curso.get()
        }
        return null
    }
}