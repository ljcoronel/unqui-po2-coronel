package ar.edu.unq.po2.tp9;

public class EmpleadoPasante extends Empleado {
	
	private int horasTrabajadas;
	
	public EmpleadoPasante(int horas) {
		this.horasTrabajadas=horas;
	}
	
	protected Double valorPorHorasTrabajadas() {
		return (this.horasTrabajadas * 40d);
	}

}
