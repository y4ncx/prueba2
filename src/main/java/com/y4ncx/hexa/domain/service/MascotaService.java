package com.y4ncx.hexa.domain.service;

import com.y4ncx.hexa.domain.model.Mascota;
import com.y4ncx.hexa.domain.repository.MascotaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MascotaService implements IMascotaService {

    private final MascotaRepository repository;

    public MascotaService(MascotaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Mascota save(Mascota mascota) {
        return repository.save(mascota);
    }

    @Override
    public Optional<Mascota> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Mascota> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Mascota> findByPropietario(String propietario) {
        return repository.findByPropietario(propietario);
    }

    @Override
    public Mascota update(Long id, Mascota mascota) {
        mascota.setId(id);
        return repository.save(mascota);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }
}
