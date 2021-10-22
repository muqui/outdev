package com.boot.alberto.model;

public class Person {
	String usuario;
	String password;
	String correo;
	
	public Person() {
		
	}
	
	public Person(String usuario, String password, String correo) {
		
		this.usuario = usuario;
		this.password = password;
		this.correo = correo;
	}

	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
	
	
	
	
	

}
