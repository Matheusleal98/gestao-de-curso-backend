package com.example.studentcode.entity

import jakarta.persistence.*
import java.util.*

@Table(name = "tb_aluno")
@Entity
class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    var ra: Number? = null
    var nome: String? = null
    var email: String? = null
    var dtNascimento: Date? = null
}