package ar.edu.unq.po2.tp9;

public class EmpleadoPlanta extends Empleado {
	
	private int cantidadDeHijos;
	
	public EmpleadoPlanta(int hijos) {
		this.cantidadDeHijos=hijos;
	}
	
	protected Double sueldoBasico() {
		return 3000d;
	}
	
	protected Double aportesFamiliares() {
		return (this.cantidadDeHijos * 150d);
	}

}
