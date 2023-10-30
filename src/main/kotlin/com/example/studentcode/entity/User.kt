package com.example.studentcode.entity

import jakarta.persistence.*
import lombok.Getter
import lombok.Setter

@Entity
@Table(name = "tb_user")
@Getter
@Setter
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    var nome: String? = null
    var email: String? = null
    var senha: String? = null
}