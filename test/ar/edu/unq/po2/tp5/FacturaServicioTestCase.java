package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FacturaServicioTestCase {
	
	private FacturaServicio factura;
	private Agencia agencia;

	@BeforeEach
	void setUp() {
		this.agencia = mock(Agencia.class);
		this.factura = new FacturaServicio(this.agencia, 40, 20);
	}

	@Test
	void testUnaFacturaDeSercicioDevuelveSuMontoAPagar() {
		Double monto = this.factura.montoAPagar();
		
		assertEquals(800, monto);
	}
	
	@Test
	void testUnaFacturaDeServicioRegistraSuPagoEnUnaAgencia() {
		this.factura.registrar();
		
		verify(this.agencia).registrarPago(this.factura);
	}

}
