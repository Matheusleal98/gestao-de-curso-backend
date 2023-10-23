package com.example.studentcode.dto

import java.util.Date

data class AlunoDTO (
    val ra: Number,
    val nome: String,
    val email: String,
    val dtNascimento: Date
)