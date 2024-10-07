package ar.edu.unq.po2.tp5;

import java.sql.Date;
import java.util.Calendar;

public class Persona implements Viviente {
	
	private String nombre;
	private Date fechaDeNacimiento;
	
	public Persona(String nombre, Date fecha) {
		this.nombre=nombre;
		this.fechaDeNacimiento=fecha;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Date getFechaDeNacimiento() {
		return this.fechaDeNacimiento;
	}
	
	public int getEdad() {
		Calendar fechaActual = Calendar.getInstance();
		return ((fechaActual.getTime().getYear()) - (this.fechaDeNacimiento.getYear()));
	}
	
	public boolean esMenorA(Persona persona) {
		return (this.getEdad() < persona.getEdad());
	}

}
