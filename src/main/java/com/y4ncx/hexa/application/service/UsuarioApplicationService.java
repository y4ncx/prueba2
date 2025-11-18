package com.y4ncx.hexa.application.service;

import com.y4ncx.hexa.application.dto.UsuarioDTO;
import com.y4ncx.hexa.application.mapper.UsuarioMapper;
import com.y4ncx.hexa.domain.service.IUsuarioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioApplicationService {

    private final IUsuarioService usuarioService;

    public UsuarioApplicationService(IUsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public UsuarioDTO create(UsuarioDTO dto) {
        return UsuarioMapper.toDTO(
                usuarioService.save(UsuarioMapper.toModel(dto))
        );
    }

    public UsuarioDTO findById(Long id) {
        return UsuarioMapper.toDTO(usuarioService.findById(id));
    }

    public List<UsuarioDTO> findAll() {
        return usuarioService.findAll()
                .stream().map(UsuarioMapper::toDTO).toList();
    }

    public void delete(Long id) {
        usuarioService.delete(id);
    }
}
