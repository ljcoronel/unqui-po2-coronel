package ar.edu.unq.po2.tp9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTemporarioTestCase {
	
	private EmpleadoTemporario empleadoUno;
	private EmpleadoTemporario empleadoDos;
	private EmpleadoTemporario empleadoTres;
	private EmpleadoTemporario empleadoCuatro;

	@BeforeEach
	void setUp() {
		this.empleadoUno = new EmpleadoTemporario(20, true, true);
		this.empleadoDos = new EmpleadoTemporario(40, true, false);
		this.empleadoTres = new EmpleadoTemporario(70, false, true);
		this.empleadoCuatro = new EmpleadoTemporario(90, false, false);
	}

	@Test
	void testUnEmpleadoTemporarioQueTrabajoVeinteHorasYTieneHijosYEstaCasadoDevuelveSuSueldo() {
		Double monto = this.empleadoUno.sueldo();
		
		assertEquals(1044, monto);
	}
	
	@Test
	void testUnEmpleadoTemporarioQueTrabajoCuarentaHorasYTieneHijosYNoEstaCasadoDevuelveSuSueldo() {
		Double monto = this.empleadoDos.sueldo();
		
		assertEquals(1131, monto);
	}
	
	@Test
	void testUnEmpleadoTemporarioQueTrabajoSetentaHorasYNoTieneHijosYEstaCasadoDevuelveSuSueldo() {
		Double monto = this.empleadoTres.sueldo();
		
		assertEquals(1261.5, monto);
	}
	
	@Test
	void testUnEmpleadoTemporarioQueTrabajoNoventaHorasYNoTieneHijosYNoEstaCasadoDevuelveSuSueldo() {
		Double monto = this.empleadoCuatro.sueldo();
		
		assertEquals(1261.5, monto);
	}

}
