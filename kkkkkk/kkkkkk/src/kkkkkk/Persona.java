package kkkkkk;

public class Persona implements Comparable<Persona>{
	private String nombre;
	private String apellido;
	private int numero;
	private int id;
	
	public Persona(String nombre, String apellido, int numero) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.numero = numero;
	}
	
	@Override
	public int compareTo(Persona o) {
		return id - o.getId();
	}
	
	@Override
	public boolean equals(Object obj) {
		Persona pepe = (Persona) obj;
		return id == pepe.getId();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	

}
