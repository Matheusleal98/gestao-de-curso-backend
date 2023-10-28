package com.example.studentcode.repository

import com.example.studentcode.entity.Instrutor
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
open interface InstrutorRepository : JpaRepository<Instrutor, Long>{
}