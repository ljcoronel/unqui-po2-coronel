package ar.edu.unq.po2.tp6;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito {
	
	private Propiedad propiedadInmobiliaria;

	public SolicitudDeCreditoHipotecario(Cliente cliente, Double monto, int plazo, Propiedad propiedad) {
		super(cliente, monto, plazo);
		this.propiedadInmobiliaria=propiedad;
	}
	
	public boolean tieneIngresosMensualesSuficientes() {
		return (this.montoDeCuotaMensual() <= (this.getCliente().getSueldoNetoMensual() * 0.5));
	}
	
	public boolean tieneValorFiscalSuficiente() {
		return (this.getMontoSolicitado() <= (this.propiedadInmobiliaria.getValorFiscal() * 0.7));
	}
	
	public boolean tieneEdadSuficiente() {
		return ((this.getCliente().getEdad() + (this.getPlazoEnMeses() / 12)) <= 65);
	}

	@Override
	public boolean esAceptable() {
		return (this.tieneIngresosMensualesSuficientes() && this.tieneValorFiscalSuficiente() && this.tieneEdadSuficiente());
	}

}
