package com.y4ncx.hexa.application.controller;

import com.y4ncx.hexa.application.dto.MascotaDTO;
import com.y4ncx.hexa.application.mapper.MascotaMapper;
import com.y4ncx.hexa.domain.service.IMascotaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mascotas")
public class MascotaController {

    private final IMascotaService service;

    public MascotaController(IMascotaService service) {
        this.service = service;
    }

    @PostMapping
    public MascotaDTO create(@RequestBody MascotaDTO dto) {
        return MascotaMapper.toDTO(
                service.save(
                        MascotaMapper.toModel(dto)
                )
        );
    }

    @GetMapping("/{id}")
    public MascotaDTO findById(@PathVariable Long id) {
        return service.findById(id)
                .map(MascotaMapper::toDTO)
                .orElse(null);
    }

    @GetMapping
    public List<MascotaDTO> findAll() {
        return service.findAll().stream()
                .map(MascotaMapper::toDTO)
                .toList();
    }

    @PatchMapping("/{id}")
    public MascotaDTO update(@PathVariable Long id, @RequestBody MascotaDTO dto) {
        return MascotaMapper.toDTO(
                service.update(id, MascotaMapper.toModel(dto))
        );
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
