package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTestCase {
	
	private Multioperador multioperador;

	@BeforeEach
	void setUp() throws Exception {
		
		this.multioperador = new Multioperador(); // {-1.3.5.7.-9.1.1.1.1.4}
		this.multioperador.agregarNumero(-1);
		this.multioperador.agregarNumero(3);
		this.multioperador.agregarNumero(5);
		this.multioperador.agregarNumero(7);
		this.multioperador.agregarNumero(-9);
		this.multioperador.agregarNumero(1);
		this.multioperador.agregarNumero(1);
		this.multioperador.agregarNumero(1);
		this.multioperador.agregarNumero(1);
		this.multioperador.agregarNumero(4);
		
	}

	@Test
	void testSumatoria() {
		int cantidad= this.multioperador.sumatoriaDeLosNumeros();
		assertEquals(13, cantidad);
	}
	
	@Test
	void testResto() {
		int cantidad= this.multioperador.restaDeLosNumeros();
		assertEquals((-13), cantidad);
	}
	
	@Test
	void testProductoria() {
		int cantidad= this.multioperador.productoriaDeLosNumeros();
		assertEquals(3780, cantidad);
	}

}
