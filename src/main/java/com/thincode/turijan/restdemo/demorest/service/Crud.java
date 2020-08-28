package com.thincode.turijan.restdemo.demorest.service;

import java.util.List;
import java.util.Optional;

import com.thincode.turijan.restdemo.demorest.entity.UsuarioEntity;
import com.thincode.turijan.restdemo.demorest.model.Usuario;



public interface Crud {

	abstract public List<UsuarioEntity> consultarTodos();
	
	abstract public Usuario getUsuario(String name);
	
	abstract public void modificarUsuario(UsuarioEntity Usuario );
	
	abstract public void eliminarUsuaris(String name);
	
	abstract public void crearUsuario(UsuarioEntity Usuario);

	
}
