package com.estudos.kotlin.funcionarios

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
class FuncionariosController {

    @GetMapping(value = ["/sayHello"])
    @ResponseBody
    fun buscar(): String {
        return "Hello Word"
    }
}