package com.y4ncx.hexa.domain.service;

import com.y4ncx.hexa.domain.model.Credenciales;
import com.y4ncx.hexa.domain.model.Usuario;
import com.y4ncx.hexa.domain.repository.UsuarioRepository;

public class AuthServiceImpl implements IAuthService {

    private final UsuarioRepository usuarioRepository;

    public AuthServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario login(Credenciales credenciales) {

        Usuario usuario = usuarioRepository.findByEmail(credenciales.getEmail());

        if (usuario == null) {
            throw new RuntimeException("Usuario no encontrado");
        }

        if (!usuario.getPassword().equals(credenciales.getPassword())) {
            throw new RuntimeException("Contraseña incorrecta");
        }

        return usuario;
    }

}
