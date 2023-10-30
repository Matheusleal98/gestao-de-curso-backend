package com.example.studentcode.service

import com.example.studentcode.repository.MatriculaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MatriculaService {

    @Autowired
    private lateinit var matriculaRepository: MatriculaRepository
}