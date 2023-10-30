package com.example.studentcode.repository

import com.example.studentcode.entity.Matricula
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
open interface MatriculaRepository : JpaRepository<Matricula, Long>{
}