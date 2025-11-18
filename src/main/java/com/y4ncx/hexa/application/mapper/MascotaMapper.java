package com.y4ncx.hexa.application.mapper;

import com.y4ncx.hexa.application.dto.MascotaDTO;
import com.y4ncx.hexa.domain.model.Mascota;

public class MascotaMapper {

    public static MascotaDTO toDTO(Mascota m) {
        MascotaDTO dto = new MascotaDTO();
        dto.setId(m.getId());
        dto.setNombre(m.getNombre());
        dto.setGenero(m.getGenero());
        dto.setPeso(m.getPeso());
        dto.setTamano(m.getTamano());
        dto.setColor(m.getColor());
        dto.setRaza(m.getRaza());
        dto.setEspecie(m.getEspecie());
        dto.setFechaNacimiento(m.getFechaNacimiento());
        dto.setPropietario(m.getPropietario());
        dto.setDomesticoOSalvaje(m.getDomesticoOSalvaje());
        dto.setTieneVacunas(m.getTieneVacunas());
        dto.setVeterinario(m.getVeterinario());
        return dto;
    }

    public static Mascota toModel(MascotaDTO dto) {
        Mascota m = new Mascota();
        m.setId(dto.getId());
        m.setNombre(dto.getNombre());
        m.setGenero(dto.getGenero());
        m.setPeso(dto.getPeso());
        m.setTamano(dto.getTamano());
        m.setColor(dto.getColor());
        m.setRaza(dto.getRaza());
        m.setEspecie(dto.getEspecie());
        m.setFechaNacimiento(dto.getFechaNacimiento());
        m.setPropietario(dto.getPropietario());
        m.setDomesticoOSalvaje(dto.getDomesticoOSalvaje());
        m.setTieneVacunas(dto.getTieneVacunas());
        m.setVeterinario(dto.getVeterinario());
        return m;
    }
}
