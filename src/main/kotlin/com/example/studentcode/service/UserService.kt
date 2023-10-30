package com.example.studentcode.service

import com.example.studentcode.entity.User
import com.example.studentcode.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {

    @Autowired
    private lateinit var userRepository: UserRepository

    fun login(email: String, senha: String): User? {
        val user = userRepository.findByEmail(email)
        if (user != null && user.senha == senha) {
            return user
        }
        return null
    }
}