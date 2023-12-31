package com.alfredolazo.cambio.service;

import com.alfredolazo.cambio.entity.Rol;
import com.alfredolazo.cambio.enums.RolNombre;
import com.alfredolazo.cambio.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class RolService {

    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }

    public void agregarRol(Rol roles){
        rolRepository.save(roles);

    }
}