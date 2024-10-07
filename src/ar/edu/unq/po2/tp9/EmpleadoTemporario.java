package ar.edu.unq.po2.tp9;

public class EmpleadoTemporario extends Empleado {
	
	private int horasTrabajadas;
	private boolean tieneHijos;
	private boolean estaCasado;
	
	public EmpleadoTemporario(int horas, boolean tieneHijos, boolean estaCasado) {
		this.horasTrabajadas=horas;
		this.tieneHijos=tieneHijos;
		this.estaCasado=estaCasado;
	}
	
	protected Double valorPorHorasTrabajadas() {
		return (this.horasTrabajadas * 5d);
	}
	
	protected Double sueldoBasico() {
		return 1000d;
	}
	
	protected Double aportesFamiliares() {
		Double monto = (this.tieneHijos || this.estaCasado) ? 100d : 0;
		return (monto);
	}

}
