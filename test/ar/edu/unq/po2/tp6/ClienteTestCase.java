package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTestCase {
	
	private Cliente cliente;

	@BeforeEach
	void setUp() {
		this.cliente = new Cliente("Lucas", "Coronel", "calle falsa 123", 29, 400000d);
	}
	
	@Test
	void testUnClienteDevuelveSuSueldoNetoMensual() {
		Double monto = this.cliente.getSueldoNetoMensual();
		
		assertEquals(400000, monto);
	}

	@Test
	void testUnClienteDevuelveSuSueldoNetoAnual() {
		Double monto = this.cliente.sueldoNetoAnual();
		
		assertEquals(4800000, monto);
	}
	
	@Test
	void testUnClienteDevuelveSuEdad() {
		int edad = this.cliente.getEdad();
		
		assertEquals(29, edad);
	}

}
