package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTestCase {

	private ProductoPrimeraNecesidad arroz;
	private ProductoPrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		arroz = new ProductoPrimeraNecesidad("Arroz", 10d, 0.92);
		leche = new ProductoPrimeraNecesidad("Leche", 8d, 0.89);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(9.200000000000001, arroz.getPrecio());
		assertEquals(7.12, leche.getPrecio());
	}
}
