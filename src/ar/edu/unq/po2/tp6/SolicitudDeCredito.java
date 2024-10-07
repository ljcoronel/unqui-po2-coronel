package ar.edu.unq.po2.tp6;

public abstract class SolicitudDeCredito {
	
	private Cliente cliente;
	private Double montoSolicitado;
	private int plazoEnMeses;
	
	public SolicitudDeCredito(Cliente cliente, Double monto, int plazo) {
		this.cliente=cliente;
		this.montoSolicitado=monto;
		this.plazoEnMeses=plazo;
	}
	
	public Double montoDeCuotaMensual() {
		return (this.getMontoSolicitado() / this.plazoEnMeses);
	}
	
	public Double getMontoSolicitado() {
		return (this.montoSolicitado);
	}
	
	public Cliente getCliente() {
		return (this.cliente);
	}
	
	public int getPlazoEnMeses() {
		return (this.plazoEnMeses);
	}
	
	public abstract boolean esAceptable();

}
