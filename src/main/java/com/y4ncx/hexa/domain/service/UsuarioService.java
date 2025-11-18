package com.y4ncx.hexa.domain.service;

import com.y4ncx.hexa.domain.model.Usuario;
import java.util.List;

public interface UsuarioService {

    Usuario save(Usuario usuario);

    Usuario findById(Long id);

    List<Usuario> findAll();

    void delete(Long id);
}
