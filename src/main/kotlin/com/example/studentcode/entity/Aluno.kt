package com.example.studentcode.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Table(name = "tb_aluno")
@Entity
class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = 0
    var nome: String? = null
    var email: String? = null
    var dt_nascimento: String? = null
    var ra: String? = null
}