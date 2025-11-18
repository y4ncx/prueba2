package com.y4ncx.hexa.application.mapper;

import com.y4ncx.hexa.application.dto.UsuarioDTO;
import com.y4ncx.hexa.domain.model.Usuario;

public class UsuarioMapper {

    public static UsuarioDTO toDTO(Usuario u) {
        UsuarioDTO dto = new UsuarioDTO();
        dto.setId(u.getId());
        dto.setNombre(u.getNombre());
        dto.setEmail(u.getEmail());
        dto.setTelefono(u.getPassword());
        return dto;
    }

    public static Usuario toModel(UsuarioDTO dto) {
        Usuario u = new Usuario();
        u.setId(dto.getId());
        u.setNombre(dto.getNombre());
        u.setEmail(dto.getEmail());
        u.setPassword(dto.getTelefono());
        return u;
    }
}
