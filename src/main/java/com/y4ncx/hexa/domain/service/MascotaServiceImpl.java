package com.y4ncx.hexa.domain.service;

import com.y4ncx.hexa.domain.model.Mascota;
import com.y4ncx.hexa.domain.repository.MascotaRepository;

import java.util.List;
import java.util.Optional;

public class MascotaServiceImpl implements IMascotaService {

    private final MascotaRepository mascotaRepository;

    public MascotaServiceImpl(MascotaRepository mascotaRepository) {
        this.mascotaRepository = mascotaRepository;
    }

    @Override
    public Mascota save(Mascota mascota) {
        return mascotaRepository.save(mascota);
    }

    @Override
    public Optional<Mascota> findById(Long id) {
        return mascotaRepository.findById(id);
    }


    @Override
    public List<Mascota> findAll() {
        return mascotaRepository.findAll();
    }

    @Override
    public Mascota update(Long id, Mascota mascota) {
        Mascota existente = findById(id)
                .orElseThrow(() -> new RuntimeException("Mascota no encontrada"));

        mascota.setId(id);
        return mascotaRepository.save(mascota);
    }

    @Override
    public void delete(Long id) {
        mascotaRepository.delete(id);
    }

    @Override
    public List<Mascota> findByPropietario(String propietario) {
        return mascotaRepository.findByPropietario(propietario);
    }
}
