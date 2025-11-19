package com.y4ncx.hexa.infrastructure.adapter;

import com.y4ncx.hexa.domain.model.Usuario;
import com.y4ncx.hexa.domain.repository.UsuarioRepository;
import com.y4ncx.hexa.infrastructure.entity.UsuarioEntity;
import com.y4ncx.hexa.infrastructure.repository.JpaUsuarioRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UsuarioRepositoryAdapter implements UsuarioRepository {

    private final JpaUsuarioRepository jpa;

    public UsuarioRepositoryAdapter(JpaUsuarioRepository jpa) {
        this.jpa = jpa;
    }

    @Override
    public Usuario save(Usuario usuario) {
        UsuarioEntity entity = toEntity(usuario);
        return toModel(jpa.save(entity));
    }

    @Override
    public Optional<Usuario> findById(Long id) {
        return jpa.findById(id).map(this::toModel);
    }

    @Override
    public Optional<Usuario> findByEmail(String email) {
        return jpa.findByEmail(email).map(this::toModel);
    }

    @Override
    public List<Usuario> findAll() {
        return jpa.findAll().stream().map(this::toModel).toList();
    }

    @Override
    public void delete(Long id) {
        jpa.deleteById(id);
    }

    private Usuario toModel(UsuarioEntity e) {
        Usuario u = new Usuario();
        u.setId(e.getId());
        u.setNombre(e.getNombre());
        u.setEmail(e.getEmail());
        u.setPassword(e.getPassword());
        u.setTelefono(e.getTelefono());
        return u;
    }

    private UsuarioEntity toEntity(Usuario u) {
        UsuarioEntity e = new UsuarioEntity();
        e.setId(u.getId());
        e.setNombre(u.getNombre());
        e.setEmail(u.getEmail());
        e.setPassword(u.getPassword());
        e.setTelefono(u.getTelefono());
        return e;
    }
}
