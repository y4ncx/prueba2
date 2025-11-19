package com.y4ncx.hexa.application.mapper;

import com.y4ncx.hexa.application.dto.UsuarioDTO;
import com.y4ncx.hexa.domain.model.Usuario;

public class UsuarioMapper {

    public static UsuarioDTO toDTO(Usuario u) {
        if (u == null) return null;
        UsuarioDTO dto = new UsuarioDTO();
        dto.setId(u.getId());
        dto.setNombre(u.getNombre());
        dto.setEmail(u.getEmail());
        dto.setTelefono(u.getTelefono());
        return dto;
    }

    public static Usuario toModel(UsuarioDTO dto) {
        if (dto == null) return null;
        Usuario u = new Usuario();
        u.setId(dto.getId());
        u.setNombre(dto.getNombre());
        u.setEmail(dto.getEmail());
        u.setTelefono(dto.getTelefono());
        return u;
    }
}
