package ar.edu.unq.po2.tp9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoPlantaTestCase {
	
	private EmpleadoPlanta empleado;

	@BeforeEach
	void setUp() {
		this.empleado = new EmpleadoPlanta(3);
	}

	@Test
	void testUnEmpleadoDePlantaConTresHijosDevuelveSuSueldo() {
		Double monto = this.empleado.sueldo();
		
		assertEquals(3001.5, monto);
	}

}
