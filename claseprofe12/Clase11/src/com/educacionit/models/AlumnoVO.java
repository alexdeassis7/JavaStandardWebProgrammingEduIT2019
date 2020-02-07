package com.educacionit.models;

public class AlumnoVO {

	private String name;
	private String Apellido;
	private String email;
	private String phone;
	private String message;
	private String lista;

	public AlumnoVO(String name, String apellido, String email, String phone, String message, String lista) {
		super();
		this.name = name;
		Apellido = apellido;
		this.email = email;
		this.phone = phone;
		this.message = message;
		this.lista = lista;
	}

	public AlumnoVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getLista() {
		return lista;
	}

	public void setLista(String lista) {
		this.lista = lista;
	}

}
