package ar.edu.unq.po2.tp4;

public class IngresoPorHorasExtras extends Ingreso {
	
	private int cantidadDeHorasExtras;

	public IngresoPorHorasExtras(String mes, String concepto, double monto, int horasExtras) {
		super(mes, concepto, monto);
		this.cantidadDeHorasExtras=horasExtras;
	}
	
	public double montoImponible() {
		return 0;
	}

}
