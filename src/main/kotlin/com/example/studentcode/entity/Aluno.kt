package com.example.studentcode.entity

import jakarta.persistence.*
import java.util.*

@Table(name = "tb_aluno")
@Entity
class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    @Column(name = "RA")
    var ra: Number? = null
    @Column(name = "NOME")
    var nome: String? = null
    @Column(name = "EMAIL")
    var email: String? = null
    @Column(name = "DT_NASCIMENTO")
    var dtNascimento: Date? = null
}