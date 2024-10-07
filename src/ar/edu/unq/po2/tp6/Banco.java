package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<SolicitudDeCredito> solicitudes = new ArrayList<SolicitudDeCredito>();
	
	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public void agregarSolicitudDeCredito(SolicitudDeCredito solicitud) {
		if (this.clientes.contains(solicitud.getCliente())) {
			this.solicitudes.add(solicitud);
		}
	}
	
	public Double montoADesembolsar() {
		Double monto = this.solicitudes.stream()
				.filter(solicitud->solicitud.esAceptable())
				.mapToDouble(solicitud->solicitud.getMontoSolicitado())
				.sum();
		return monto;
	}

}
