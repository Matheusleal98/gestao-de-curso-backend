package com.example.studentcode.controller

import com.example.studentcode.service.MatriculaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/matricula")
class MatriculaController {

    @Autowired
    private lateinit var matriculaService: MatriculaService
}