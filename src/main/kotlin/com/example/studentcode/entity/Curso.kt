package com.example.studentcode.entity

import jakarta.persistence.*
import lombok.Getter
import lombok.Setter

@Table(name = "tb_curso")
@Entity
@Getter
@Setter
class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    var nome: String? = null
    var descricao: String? = null
    @ManyToOne
    var instrutor: Instrutor? = null
}