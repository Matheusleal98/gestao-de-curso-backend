package com.example.studentcode.entity

import jakarta.persistence.*
import lombok.Getter
import lombok.Setter

@Table(name = "tb_instrutor")
@Entity
@Getter
@Setter
class Instrutor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    var nome: String? = null
    var email: String? = null
    var especializacao: String? = null
}