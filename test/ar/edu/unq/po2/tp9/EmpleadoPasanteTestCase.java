package ar.edu.unq.po2.tp9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoPasanteTestCase {
	
	private EmpleadoPasante empleado;

	@BeforeEach
	void setUp() {
		this.empleado = new EmpleadoPasante(50);
	}

	@Test
	void testUnEmpleadoPasanteQueTrabajoCincuentaHorasDevuelveSuSueldo() {
		Double monto = this.empleado.sueldo();
		
		assertEquals(1740, monto);
	}

}
