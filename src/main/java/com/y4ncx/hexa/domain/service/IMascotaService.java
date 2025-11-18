package com.y4ncx.hexa.domain.service;

import com.y4ncx.hexa.domain.model.Mascota;

import java.util.List;
import java.util.Optional;

public interface IMascotaService {

    Mascota save(Mascota mascota);

    Optional<Mascota> findById(Long id);

    List<Mascota> findAll();

    List<Mascota> findByPropietario(String propietario);

    Mascota update(Long id, Mascota mascota);

    void delete(Long id);
}
