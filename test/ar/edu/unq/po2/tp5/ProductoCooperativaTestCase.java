package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoCooperativaTestCase {
	
	private ProductoCooperativa producto;

	@BeforeEach
	void setUp() {
		this.producto = new ProductoCooperativa(100d, 44);
	}

	@Test
	void testUnProductoDeCooperativaDevuelveSuPrecio() {
		Double precio = this.producto.montoAPagar();
		
		assertEquals(90, precio);
	}

}
