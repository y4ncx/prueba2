package com.y4ncx.hexa.application.service;

import com.y4ncx.hexa.application.dto.MascotaDTO;
import com.y4ncx.hexa.application.mapper.MascotaMapper;
import com.y4ncx.hexa.domain.service.IMascotaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaApplicationService {

    private final IMascotaService mascotaService;

    public MascotaApplicationService(IMascotaService mascotaService) {
        this.mascotaService = mascotaService;
    }

    public MascotaDTO create(MascotaDTO dto) {
        return MascotaMapper.toDTO(
                mascotaService.save(MascotaMapper.toModel(dto))
        );
    }

    public MascotaDTO findById(Long id) {
        return MascotaMapper.toDTO(mascotaService.findById(id));
    }

    public List<MascotaDTO> findAll() {
        return mascotaService.findAll()
                .stream().map(MascotaMapper::toDTO).toList();
    }

    public MascotaDTO update(Long id, MascotaDTO dto) {
        return MascotaMapper.toDTO(
                mascotaService.update(id, MascotaMapper.toModel(dto))
        );
    }

    public void delete(Long id) {
        mascotaService.delete(id);
    }
}
