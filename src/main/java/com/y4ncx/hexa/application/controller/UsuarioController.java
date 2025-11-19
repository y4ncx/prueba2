package com.y4ncx.hexa.application.controller;

import com.y4ncx.hexa.application.dto.UsuarioDTO;
import com.y4ncx.hexa.application.service.UsuarioApplicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioApplicationService service;

    public UsuarioController(UsuarioApplicationService service) {
        this.service = service;
    }

    @PostMapping
    public UsuarioDTO create(@RequestBody UsuarioDTO dto) {
        return service.create(dto);
    }

    @GetMapping("/{id}")
    public UsuarioDTO findById(@PathVariable Long id) {
        return service.findById(id)
                .orElse(null);
    }

    @PutMapping("/{id}")
    public UsuarioDTO update(
            @PathVariable Long id,
            @RequestBody UsuarioDTO usuarioDTO) {
        return service.update(id, usuarioDTO);
    }


    @GetMapping
    public List<UsuarioDTO> findAll() {
        return service.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
