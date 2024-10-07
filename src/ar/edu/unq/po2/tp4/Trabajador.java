package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	
	private Impuesto impuesto;
	private List<Ingreso> ingresos = new ArrayList<Ingreso>();
	
	public Trabajador(Impuesto impuesto, List<Ingreso> ingresos) {
		this.impuesto=impuesto;
		this.ingresos=ingresos;
	}
	
	public double getTotalPercibido() {
		double total=0;
		for(int i=0; i<this.ingresos.size(); i++) {
			total += this.ingresos.get(i).getMontoPercibido();
		}
		return total;
	}
	
	public double getMontoImponible() {
		double total=0;
		for(int i=0; i<this.ingresos.size(); i++) {
			total += this.ingresos.get(i).montoImponible();
		}
		return total;
	}
	
	public double getImpuestoAPagar() {
		return (this.impuesto.montoAPagar(this.getMontoImponible()));
	}

}
