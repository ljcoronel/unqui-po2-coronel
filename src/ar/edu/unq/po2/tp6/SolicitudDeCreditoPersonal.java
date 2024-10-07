package ar.edu.unq.po2.tp6;

public class SolicitudDeCreditoPersonal extends SolicitudDeCredito {

	public SolicitudDeCreditoPersonal(Cliente cliente, Double monto, int plazo) {
		super(cliente, monto, plazo);
	}
	
	public boolean tieneIngresosAnualesSuficientes() {
		return (this.getCliente().sueldoNetoAnual() >= 15000);
	}
	
	public boolean tieneIngresosMensualesSuficientes() {
		return (this.montoDeCuotaMensual() <= (this.getCliente().getSueldoNetoMensual() * 0.7));
	}

	@Override
	public boolean esAceptable() {
		return (this.tieneIngresosAnualesSuficientes() && this.tieneIngresosMensualesSuficientes());
	}

}
