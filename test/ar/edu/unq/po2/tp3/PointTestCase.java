package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTestCase {
	
	private Point punto1;
	private Point punto2;

	@BeforeEach
	void setUp() throws Exception {
		
		this.punto1= new Point();
		this.punto2= new Point(3, 9);
		
	}

	@Test
	void testCoordenadaX() {
		this.punto1.moverPunto(4, 8);
		this.punto1.sumarConOtroPunto(punto2);
		float numeroEsperado= this.punto1.getCoordenadaX();
		assertEquals(7, numeroEsperado);
	}
	
	@Test
	void testCoordenadaY() {
		this.punto1.sumarConOtroPunto(punto2);
		float numeroEsperado= this.punto1.getCoordenadaY();
		assertEquals(9, numeroEsperado);
	}

}
