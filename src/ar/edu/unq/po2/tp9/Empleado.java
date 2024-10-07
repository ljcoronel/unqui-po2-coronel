package ar.edu.unq.po2.tp9;

public abstract class Empleado {
	
	public final Double sueldo() {
		Double sumatoriaDePagos = this.sueldoBasico() + this.valorPorHorasTrabajadas() + this.aportesFamiliares();
		return (this.descontarEnConceptoDeAportesYObraSocial(sumatoriaDePagos));
	}
	
	protected Double sueldoBasico() {
		return 0d;
	}
	
	protected Double valorPorHorasTrabajadas() {
		return 0d;
	}
	
	protected Double aportesFamiliares() {
		return 0d;
	}
	
	private Double descontarEnConceptoDeAportesYObraSocial(Double monto) {
		return (monto - (monto * 0.13));
	}

}
