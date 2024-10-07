package ar.edu.unq.po2.tp5;

public class FacturaImpuesto extends Factura {
	
	private double tasaDeServicio;
	
	public FacturaImpuesto(Agencia agencia, double tasa) {
		super(agencia);
		this.tasaDeServicio=tasa;
	}

	@Override
	public double montoAPagar() {
		return (this.tasaDeServicio);
	}

}
