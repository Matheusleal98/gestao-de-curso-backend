package com.example.studentcode.repository

import com.example.studentcode.entity.Curso
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
open interface CursoRepository : JpaRepository<Curso, Long>{
}