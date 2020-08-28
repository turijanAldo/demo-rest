package com.thincode.turijan.restdemo.demorest.service.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thincode.turijan.restdemo.demorest.entity.UsuarioEntity;
import com.thincode.turijan.restdemo.demorest.model.Usuario;
import com.thincode.turijan.restdemo.demorest.repository.CatalogoUsuariosRepo;
import com.thincode.turijan.restdemo.demorest.service.Crud;

@Service
public class ImpUsuarioServ implements Crud{

	@Autowired
	private CatalogoUsuariosRepo reposUsuarios;
	
	
	@Override
	public List<UsuarioEntity> consultarTodos() {
		return reposUsuarios.findAll();
	}

	@Override
	public Usuario getUsuario(String name) {
		Usuario user = new Usuario();
		UsuarioEntity userentity = null;
		Optional<UsuarioEntity> optionUser = reposUsuarios.findById(name);
		if(optionUser.isPresent()) {
			userentity = optionUser.get();
			BeanUtils.copyProperties(userentity, user);
		}
		return user;
	}

	@Override
	public void modificarUsuario(UsuarioEntity Usuario) {
		// TODO Auto-generated method stub
		reposUsuarios.save(Usuario);
	}

	@Override
	public void eliminarUsuaris(String name) {
		// TODO Auto-generated method stub
		reposUsuarios.deleteById(name);
	}

	@Override
	public void crearUsuario(UsuarioEntity Usuario) {
		// TODO Auto-generated method stub
		reposUsuarios.save(Usuario);
	}

}
