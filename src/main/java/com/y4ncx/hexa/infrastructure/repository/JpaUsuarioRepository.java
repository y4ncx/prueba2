package com.y4ncx.hexa.infrastructure.repository;

import com.y4ncx.hexa.infrastructure.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    UsuarioEntity findByEmail(String email);

}
