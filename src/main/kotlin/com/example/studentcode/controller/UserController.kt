package com.example.studentcode.controller

import com.example.studentcode.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/login")
class UserController {

    @Autowired
    private lateinit var userService: UserService

    @PostMapping
    fun login(@RequestParam email: String, @RequestParam senha: String): ResponseEntity<*> {
        val user = userService.login(email, senha)
        return if (user != null) {
            ResponseEntity.ok("Login bem-sucedido")
        } else {
            ResponseEntity.badRequest().body("Credenciais inválidas")
        }
    }
}