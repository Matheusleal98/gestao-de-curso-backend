package com.example.studentcode.repository

import com.example.studentcode.entity.Aluno
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
open interface AlunoRepository : JpaRepository<Aluno, Long> {
}