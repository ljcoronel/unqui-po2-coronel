package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DesarmadorTestCase {
	
	private List<Integer> numeros= new ArrayList<Integer>();
	private Desarmador desarmador;

	@BeforeEach
	void setUp() throws Exception {
		
		this.numeros.add(5394128);
		this.desarmador = new Desarmador();
		
	}

	@Test
	void testNumeroConMasDigitosPares() {
		this.desarmador.calcularNumeroConMayorCantidadDeDigitosPares(numeros);
		
		int cantidad= this.desarmador.numeroConMayorCantidadDeDigitosPares();
		assertEquals(5394128, cantidad);
	}

}
