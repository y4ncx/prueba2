package com.y4ncx.hexa.domain.service;

import com.y4ncx.hexa.domain.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {
    Usuario save(Usuario usuario);
    Optional<Usuario> findById(Long id);
    List<Usuario> findAll();
    void delete(Long id);
}
