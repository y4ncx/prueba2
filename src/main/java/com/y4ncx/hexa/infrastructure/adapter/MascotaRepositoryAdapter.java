package com.y4ncx.hexa.infrastructure.adapter;

import com.y4ncx.hexa.domain.model.Mascota;
import com.y4ncx.hexa.domain.repository.MascotaRepository;
import com.y4ncx.hexa.infrastructure.entity.MascotaEntity;
import com.y4ncx.hexa.infrastructure.repository.JpaMascotaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MascotaRepositoryAdapter implements MascotaRepository {

    private final JpaMascotaRepository jpa;

    public MascotaRepositoryAdapter(JpaMascotaRepository jpa) {
        this.jpa = jpa;
    }

    @Override
    public Mascota save(Mascota mascota) {
        return toModel(jpa.save(toEntity(mascota)));
    }

    @Override
    public Optional<Mascota> findById(Long id) {
        return jpa.findById(id).map(this::toModel);
    }

    @Override
    public List<Mascota> findAll() {
        return jpa.findAll().stream().map(this::toModel).toList();
    }

    @Override
    public List<Mascota> findByPropietario(String propietario) {
        return jpa.findByPropietario(propietario)
                .stream().map(this::toModel).toList();
    }

    @Override
    public void delete(Long id) {
        jpa.deleteById(id);
    }

    private Mascota toModel(MascotaEntity e) {
        Mascota m = new Mascota();
        m.setId(e.getId());
        m.setNombre(e.getNombre());
        m.setGenero(e.getGenero());
        m.setPeso(e.getPeso());
        m.setTamano(e.getTamano());
        m.setColor(e.getColor());
        m.setRaza(e.getRaza());
        m.setEspecie(e.getEspecie());
        m.setFechaNacimiento(e.getFechaNacimiento());
        m.setPropietario(e.getPropietario());
        m.setDomesticoOSalvaje(e.getDomesticoOSalvaje());
        m.setTieneVacunas(e.getTieneVacunas());
        m.setVeterinario(e.getVeterinario());
        return m;
    }

    private MascotaEntity toEntity(Mascota m) {
        MascotaEntity e = new MascotaEntity();
        e.setNombre(m.getNombre());
        e.setGenero(m.getGenero());
        e.setPeso(m.getPeso());
        e.setTamano(m.getTamano());
        e.setColor(m.getColor());
        e.setRaza(m.getRaza());
        e.setEspecie(m.getEspecie());
        e.setFechaNacimiento(m.getFechaNacimiento());
        e.setPropietario(m.getPropietario());
        e.setDomesticoOSalvaje(m.getDomesticoOSalvaje());
        e.setTieneVacunas(m.getTieneVacunas());
        e.setVeterinario(m.getVeterinario());
        return e;
    }
}
