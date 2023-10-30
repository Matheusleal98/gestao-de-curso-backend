package com.example.studentcode.repository

import com.example.studentcode.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
open interface UserRepository : JpaRepository<User, Long> {
    fun findByEmail(email: String): User?
}