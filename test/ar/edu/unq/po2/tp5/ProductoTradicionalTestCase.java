package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTradicionalTestCase {
	
	private ProductoTradicional producto;

	@BeforeEach
	void setUp() {
		this.producto = new ProductoTradicional(12d, 22);
	}

	@Test
	void testUnProductoDeEmpresaTradicionalDevuelveSuPrecio() {
		Double precio = this.producto.montoAPagar();
		
		assertEquals(12d, precio);
	}

}
