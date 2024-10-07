package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTestCase {
	
	private Trabajador trabajador;
	private Ingreso ingreso1;
	private Ingreso ingreso2;
	private IngresoPorHorasExtras ingresoEx;
	private Impuesto impuesto;
	private List<Ingreso> ingresos = new ArrayList<Ingreso>();

	@BeforeEach
	void setUp() throws Exception {
		
		this.impuesto = new Impuesto();
		this.ingreso1 = new Ingreso("Abril", "C1", 9000);
		this.ingreso2 = new Ingreso("Mayo", "C2", 7000);
		this.ingresoEx = new IngresoPorHorasExtras("Mayo", "C2", 2000, 4);
		this.ingresos.add(ingreso1);
		this.ingresos.add(ingreso2);
		this.ingresos.add(ingresoEx);
		this.trabajador = new Trabajador(impuesto, ingresos);
		
	}

	@Test
	void testTotalPercibido() {
		double monto = this.trabajador.getTotalPercibido();
		assertEquals(18000, monto);
	}
	
	@Test
	void testMontoImponible() {
		double monto = this.trabajador.getMontoImponible();
		assertEquals(16000, monto);
	}
	
	@Test
	void testImpuestoAPagar() {
		double monto = this.trabajador.getImpuestoAPagar();
		assertEquals(320, monto);
	}

}
