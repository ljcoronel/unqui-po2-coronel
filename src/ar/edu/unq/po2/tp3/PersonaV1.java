package ar.edu.unq.po2.tp3;

import java.sql.Date;
import java.time.Period;
import java.util.Calendar;

public class PersonaV1 {
	
	private String nombre;
	private Date fechaNacimiento;
	
	public PersonaV1(String nombre, Date fechaNacimiento) {
		this.nombre=nombre;
		this.fechaNacimiento=fechaNacimiento;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Date getFechaDeNacimiento() {
		return this.fechaNacimiento;
	}
	
	public int getEdad() {
		return (this.fechaNacimiento.getYear() - Calendar.YEAR);
	}
	
	public boolean menorQue(PersonaV1 persona) {
		return (this.getEdad() < persona.getEdad());
	}

}
