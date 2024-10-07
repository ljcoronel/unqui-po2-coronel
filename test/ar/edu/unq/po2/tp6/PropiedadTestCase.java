package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropiedadTestCase {
	
	private Propiedad propiedad;

	@BeforeEach
	void setUp() {
		this.propiedad = new Propiedad("una choza", "calle falsa 5678", 9000000d);
	}

	@Test
	void testUnaPropiedadDevuelveSuValorFiscal() {
		Double valor = this.propiedad.getValorFiscal();
		
		assertEquals(9000000d, valor);
	}

}
