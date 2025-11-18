package com.y4ncx.hexa.domain.repository;

import com.y4ncx.hexa.domain.model.Mascota;

import java.util.List;
import java.util.Optional;

public interface MascotaRepository {

    Mascota save(Mascota mascota);

    Optional<Mascota> findById(Long id);

    List<Mascota> findAll();

    List<Mascota> findByPropietario(String propietario);

    void delete(Long id);
}
