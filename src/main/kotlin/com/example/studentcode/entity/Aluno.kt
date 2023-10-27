package com.example.studentcode.entity

import jakarta.persistence.*
import lombok.Getter
import lombok.Setter
import java.time.LocalDate
import java.util.*


@Table(name = "tb_aluno")
@Entity
@Getter
@Setter
class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    var ra: Long? = null // Alterado para Long para representar um número inteiro longo
    var nome: String? = null
    var email: String? = null
    @Temporal(TemporalType.DATE)
    var dtNascimento: LocalDate? = null
}