package com.estudos.kotlin.funcionarios

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface FuncionariosRepository : JpaRepository<Funcionarios, UUID> {
}