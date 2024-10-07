package ar.edu.unq.po2.tp5;

public class FacturaServicio extends Factura {
	
	private double costoPorUnidad;
	private double unidades;

	public FacturaServicio(Agencia agencia, double costo, double unidades) {
		super(agencia);
		this.costoPorUnidad=costo;
		this.unidades=unidades;
	}
	
	public double getCostoPorUnidad() {
		return (this.costoPorUnidad);
	}
	
	public double getUnidades() {
		return (this.unidades);
	}

	@Override
	public double montoAPagar() {
		return (this.getCostoPorUnidad() * this.getUnidades());
	}

}
