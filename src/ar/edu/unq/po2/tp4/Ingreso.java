package ar.edu.unq.po2.tp4;

public class Ingreso {
	
	private String mesDePercepcion;
	private String concepto;
	private double montoPercibido;
	
	public Ingreso(String mes, String concepto, double monto) {
		this.mesDePercepcion=mes;
		this.concepto=concepto;
		this.montoPercibido=monto;
	}
	
	public double getMontoPercibido() {
		return (this.montoPercibido);
	}
	
	public double montoImponible() {
		return (this.getMontoPercibido());
	}

}
