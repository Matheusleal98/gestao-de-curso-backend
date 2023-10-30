package com.example.studentcode.entity

import jakarta.persistence.*
import lombok.Getter
import lombok.Setter

@Table(name = "tb_matricula")
@Entity
@Getter
@Setter
class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    @ManyToOne
    var aluno: Aluno? = null
    @ManyToOne
    var curso: Curso? = null
    var dt_matricula: String? = null
    var status: String? = null
}