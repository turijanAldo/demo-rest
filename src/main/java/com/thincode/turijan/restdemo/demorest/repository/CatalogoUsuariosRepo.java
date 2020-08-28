package com.thincode.turijan.restdemo.demorest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thincode.turijan.restdemo.demorest.entity.UsuarioEntity;

public interface CatalogoUsuariosRepo extends JpaRepository<UsuarioEntity, String> {

}
