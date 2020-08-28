package com.thincode.turijan.restdemo.demorest.model;

public class Usuario {
	
	private String nombre;
	private String correo;
	private String pwd;
	private String fechaAlta;
	public Usuario() {
		
	}
	public Usuario(String nombre, String correo, String pwd, String fechaAlta) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.pwd = pwd;
		this.fechaAlta = fechaAlta;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
}
