package com.y4ncx.hexa.infrastructure.repository;

import com.y4ncx.hexa.infrastructure.entity.MascotaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaMascotaRepository extends JpaRepository<MascotaEntity, Long> {
    List<MascotaEntity> findByPropietario(String propietario);
}
