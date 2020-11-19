package com.estudos.kotlin.funcionarios

import org.springframework.data.annotation.CreatedDate
import java.time.Instant
import java.time.LocalDate
import java.util.UUID
import javax.persistence.*

@Entity
@Table(name = "funcionario")
data class Funcionarios(

        @Id
        val id: UUID,

        val name: String,

        val cpf: String,

        val email: String,

        val phone: String,

        val birthDate: LocalDate? = null,

        @CreatedDate
        @Column(name = "Data Contratação")
        val createdAt: Instant = Instant.now()

) {

}