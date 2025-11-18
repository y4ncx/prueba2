package com.y4ncx.hexa.domain.service;

import com.y4ncx.hexa.domain.model.Usuario;
import com.y4ncx.hexa.domain.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    private final UsuarioRepository repo;

    public UsuarioServiceImpl(UsuarioRepository repo) {
        this.repo = repo;
    }

    @Override
    public Usuario save(Usuario usuario) {
        return repo.save(usuario);
    }

    @Override
    public Usuario findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public List<Usuario> findAll() {
        return repo.findAll();
    }

    @Override
    public void delete(Long id) {
        repo.delete(id);
    }
}
