package com.alfredolazo.cambio.service;

import com.alfredolazo.cambio.entity.Usuario;
import com.alfredolazo.cambio.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Optional<Usuario> getByNombreUsuario(String nu){
        return usuarioRepository.findByNombreUsuario(nu);
    }

    public boolean existePorNombre(String nu){
        return usuarioRepository.existsByNombreUsuario(nu);
    }

    public  boolean existePorEmail(String email){
        return usuarioRepository.existsByEmail(email);
    }

    public void guardar(Usuario usuario){
        usuarioRepository.save(usuario);
    }
}

