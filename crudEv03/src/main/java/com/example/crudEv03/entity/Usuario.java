package com.example.crudEv03.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table( name = "tbl_usuario")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id_usuario;

    private String nombres;

    private String email;

}
