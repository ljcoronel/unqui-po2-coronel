package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FacturaImpuestoTestCase {
	
	private FacturaImpuesto factura;
	private Agencia agencia;

	@BeforeEach
	void setUp() {
		this.agencia = mock(Agencia.class);
		this.factura = new FacturaImpuesto(this.agencia, 30d);
	}

	@Test
	void testUnaFacturaDeImpuestoDevuelveSuMontoAPagar() {
		Double monto = this.factura.montoAPagar();
		
		assertEquals(30, monto);
	}
	
	@Test
	void testUnaFacturaDeImpuestoRegistraSuPagoEnUnaAgencia() {
		this.factura.registrar();
		
		verify(this.agencia).registrarPago(this.factura);
	}

}
