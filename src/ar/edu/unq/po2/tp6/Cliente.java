package ar.edu.unq.po2.tp6;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private Double sueldoNetoMensual;
	
	public Cliente(String nombre, String apellido, String direccion, int edad, Double sueldoMensual) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.direccion=direccion;
		this.edad=edad;
		this.sueldoNetoMensual=sueldoMensual;
	}
	
	public Double sueldoNetoAnual() {
		return (this.getSueldoNetoMensual() * 12);
	}
	
	public Double getSueldoNetoMensual() {
		return (this.sueldoNetoMensual);
	}
	
	public int getEdad() {
		return (this.edad);
	}

}
