package ar.edu.unq.po2.tp5;

public class Mascota implements Viviente {
	
	private String nombre;
	private String raza;
	
	public Mascota(String nombre, String raza) {
		this.nombre=nombre;
		this.raza=nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getRaza() {
		return this.raza;
	}

}
