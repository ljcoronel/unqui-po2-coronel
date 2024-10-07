package ar.edu.unq.po2.tp5;

public abstract class Factura implements Registrable {
	
	private Agencia agencia;
	
	public Factura(Agencia agencia) {
		this.agencia=agencia;
	}
	
	public abstract double montoAPagar();
	
	public void registrar() {
		this.agencia.registrarPago(this);
	}

}
