package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiploTestCase {
	
	private Multiplo multiplo;

	@BeforeEach
	void setUp() throws Exception {
		
		this.multiplo= new Multiplo(3,9);
		
	}

	@Test
	void testMultiplo() {
		int multiploEsperado = (this.multiplo.mayorComunMultiplo());
		assertEquals(999, multiploEsperado);
	}

}
