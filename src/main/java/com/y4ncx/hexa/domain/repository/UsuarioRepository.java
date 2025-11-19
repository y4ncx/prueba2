package com.y4ncx.hexa.domain.repository;

import com.y4ncx.hexa.domain.model.Usuario;
import java.util.List;
import java.util.Optional;

public interface UsuarioRepository {

    Usuario save(Usuario usuario);

    Optional<Usuario> findById(Long id);

    Optional<Usuario> findByEmail(String email);

    List<Usuario> findAll();

    void delete(Long id);
}
