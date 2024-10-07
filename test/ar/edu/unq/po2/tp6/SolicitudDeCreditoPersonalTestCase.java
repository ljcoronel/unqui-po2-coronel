package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolicitudDeCreditoPersonalTestCase {
	
	private SolicitudDeCreditoPersonal solicitud;
	private Cliente cliente;

	@BeforeEach
	void setUp() {
		this.cliente = mock(Cliente.class);
		this.solicitud = new SolicitudDeCreditoPersonal(this.cliente, 660d, 12);
	}
	
	@Test
	void testUnaSolicitudDeCreditoPersonalDevuelveAlClienteDeLaSolicitud() {
		Cliente cliente = this.solicitud.getCliente();
		
		assertEquals(this.cliente, cliente);
	}
	
	@Test
	void testUnaSolicitudDeCreditoPersonalDevuelveElMontoSolicitado() {
		Double monto = this.solicitud.getMontoSolicitado();
		
		assertEquals(660, monto);
	}

	@Test
	void testUnaSolicitudDeCreditoPersonalDevuelveElMontoDeLaCuotaMensual() {
		Double monto = this.solicitud.montoDeCuotaMensual();
		
		assertEquals(55, monto);
	}
	
	@Test
	void testUnaSolicitudDeCreditoPersonalIndicaSiUnClienteTieneIngresosAnualesSuficientesParaLaSolicitud() {
		when(this.cliente.sueldoNetoAnual()).thenReturn(15000d);
		
		assertTrue(this.solicitud.tieneIngresosAnualesSuficientes());
	}
	
	@Test
	void testUnaSolicitudDeCreditoPersonalIndicaSiUnClienteTieneIngresosMensualesSuficientesParaLaSolicitud() {
		when(this.cliente.getSueldoNetoMensual()).thenReturn(1250d);
		
		assertTrue(this.solicitud.tieneIngresosMensualesSuficientes());
	}
	
	@Test
	void testUnaSolicitudDeCreditoPersonalIndicaSiLaSolicitudDelClienteEsAceptada() {
		when(this.cliente.sueldoNetoAnual()).thenReturn(15000d);
		when(this.cliente.getSueldoNetoMensual()).thenReturn(1250d);
		
		assertTrue(this.solicitud.esAceptable());
	}

}
