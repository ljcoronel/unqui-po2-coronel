package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolicitudDeCreditoHipotecarioTestCase {
	
	private SolicitudDeCreditoHipotecario solicitud;
	private Cliente cliente;
	private Propiedad propiedad;

	@BeforeEach
	void setUp() {
		this.cliente = mock(Cliente.class);
		this.propiedad = mock(Propiedad.class);
		this.solicitud = new SolicitudDeCreditoHipotecario(this.cliente, 10800d, 12, this.propiedad);
	}
	
	@Test
	void testUnaSolicitudDeCreditoHipotecariolDevuelveAlClienteDeLaSolicitud() {
		Cliente cliente = this.solicitud.getCliente();
		
		assertEquals(this.cliente, cliente);
	}
	
	@Test
	void testUnaSolicitudDeHipotecarioPersonalDevuelveElMontoSolicitado() {
		Double monto = this.solicitud.getMontoSolicitado();
		
		assertEquals(10800, monto);
	}

	@Test
	void testUnaSolicitudDeCreditoHipotecariolDevuelveElMontoDeLaCuotaMensual() {
		Double monto = this.solicitud.montoDeCuotaMensual();
		
		assertEquals(900, monto);
	}

	@Test
	void testUnaSolicitudDeCreditoHipotecarioIndicaSiUnClienteTieneIngresosMensualesSuficientesParaLaSolicitud() {
		when(this.cliente.getSueldoNetoMensual()).thenReturn(1800d);
		
		assertTrue(this.solicitud.tieneIngresosMensualesSuficientes());
	}
	
	@Test
	void testUnaSolicitudDeCreditoHipotecarioIndicaSiElMontoDelValorFiscalDeUnaGarantiaEsSuficienteParaLaSolicitud() {
		when(this.propiedad.getValorFiscal()).thenReturn(15429d);
		
		assertTrue(this.solicitud.tieneValorFiscalSuficiente());
	}
	
	@Test
	void testUnaSolicitudDeCreditoHipotecarioIndicaSiLaEdadDeUnClienteEsSuficienteParaLaSolicitud() {
		when(this.cliente.getEdad()).thenReturn(64);
		
		assertTrue(this.solicitud.tieneEdadSuficiente());
	}
	
	@Test
	void testUnaSolicitudDeCreditoHipotecarioIndicaSiLaSolicitudDelClienteEsAceptada() {
		when(this.cliente.getSueldoNetoMensual()).thenReturn(1800d);
		when(this.propiedad.getValorFiscal()).thenReturn(15429d);
		when(this.cliente.getEdad()).thenReturn(64);
		
		assertTrue(this.solicitud.esAceptable());
	}

}
