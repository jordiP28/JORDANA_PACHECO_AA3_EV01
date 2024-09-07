package com.example.crudEv03.repository;

import com.example.crudEv03.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
