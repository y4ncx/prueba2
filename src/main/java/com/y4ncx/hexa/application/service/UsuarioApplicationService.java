package com.y4ncx.hexa.application.service;

import com.y4ncx.hexa.application.dto.UsuarioDTO;
import com.y4ncx.hexa.application.mapper.UsuarioMapper;
import com.y4ncx.hexa.domain.service.IUsuarioService;
import com.y4ncx.hexa.domain.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioApplicationService {

    private final IUsuarioService usuarioService;

    public UsuarioApplicationService(IUsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public UsuarioDTO create(UsuarioDTO dto) {
        Usuario saved = usuarioService.save(UsuarioMapper.toModel(dto));
        return UsuarioMapper.toDTO(saved);
    }

    public Optional<UsuarioDTO> findById(Long id) {
        return usuarioService.findById(id).map(UsuarioMapper::toDTO);
    }

    public List<UsuarioDTO> findAll() {
        return usuarioService.findAll()
                .stream().map(UsuarioMapper::toDTO).toList();
    }

    public UsuarioDTO update(Long id, UsuarioDTO dto) {
        Usuario u = UsuarioMapper.toModel(dto);
        u.setId(id);
        Usuario updated = usuarioService.save(u);
        return UsuarioMapper.toDTO(updated);
    }

    public void delete(Long id) {
        usuarioService.delete(id);
    }
}
