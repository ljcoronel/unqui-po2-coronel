package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTestCase {
	
	private Counter counter;

	@BeforeEach
	void setUp() throws Exception {
		
		this.counter = new Counter(); // {1.3.5.7.9.1.1.1.1.4}
		this.counter.agregarNumero(1);
		this.counter.agregarNumero(3);
		this.counter.agregarNumero(5);
		this.counter.agregarNumero(7);
		this.counter.agregarNumero(9);
		this.counter.agregarNumero(1);
		this.counter.agregarNumero(1);
		this.counter.agregarNumero(1);
		this.counter.agregarNumero(1);
		this.counter.agregarNumero(4);
		
	}

	@Test
	void testCantidadDePares() {
		int cantidad= this.counter.getCantidadDePares();
		assertEquals(1, cantidad);
	}
	
	@Test
	void testCantidadDeImpares() {
		int cantidad= this.counter.getCantidadDeImpares();
		assertEquals(9, cantidad);
	}
	
	@Test
	void testCantidadDeMultiplos() {
		int cantidad= this.counter.getCantidadDeNumerosMultiploDe(2);
		assertEquals(1, cantidad);
	}

}
