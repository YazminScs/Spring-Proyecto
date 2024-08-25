package com.proyecto.model;

public class User {
	private int id_user;
	private String username;
	private String password;
	private String email;
	private String rol;

	//CONSTRUCTORES
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(int id_user, String username, String password, String email, String rol) {
		super();
		this.id_user = id_user;
		this.username = username;
		this.password = password;
		this.email = email;
		this.rol = rol;
	}

	//GETTER AND SETTER
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}

	//TO STRING:
	@Override
	public String toString() {
		return "User [id_user=" + id_user + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", rol=" + rol + "]";
	}
}