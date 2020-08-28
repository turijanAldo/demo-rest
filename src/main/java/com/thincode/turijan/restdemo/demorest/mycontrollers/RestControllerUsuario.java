package com.thincode.turijan.restdemo.demorest.mycontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thincode.turijan.restdemo.demorest.entity.UsuarioEntity;
import com.thincode.turijan.restdemo.demorest.model.Usuario;
import com.thincode.turijan.restdemo.demorest.service.serviceimp.ImpUsuarioServ;

@CrossOrigin( origins = {"http://localhost:4200"}, methods ={RequestMethod.DELETE, RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
@RestController
@RequestMapping("/api")
public class RestControllerUsuario {

	@Autowired
	private ImpUsuarioServ impUsuario;
	
	
	@GetMapping("/consultartodos")
	public List<UsuarioEntity> consultarTodos(){
		return impUsuario.consultarTodos();
	}
	
	@GetMapping("/usuario/{id}")
	public Usuario consulta(@PathVariable("id") String name){
		return impUsuario.getUsuario(name);
	}
	
	@PostMapping("/usuario")
	public void guardarUsuario(@RequestBody UsuarioEntity user) {
		impUsuario.crearUsuario(user);
	}
	
	@PutMapping("/usuario")
	public void updateUsuario(@RequestBody UsuarioEntity user) {
		impUsuario.modificarUsuario(user);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteUsuario(@PathVariable("id") String name) {
		impUsuario.eliminarUsuaris(name);
	}
	
	
}
