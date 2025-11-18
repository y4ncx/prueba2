package com.y4ncx.hexa.domain.repository;

import com.y4ncx.hexa.domain.model.Usuario;
import java.util.List;

public interface UsuarioRepository {

    Usuario save(Usuario usuario);

    Usuario findById(Long id);

    Usuario findByEmail(String email);

    List<Usuario> findAll();

    void delete(Long id);
}
