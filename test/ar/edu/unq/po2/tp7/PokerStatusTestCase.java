package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTestCase {
	
	PokerStatus poker;

	@BeforeEach
	void setUp() {
		this.poker = new PokerStatus();
	}

	@Test
	void testUnPoquerStatusTieneDosCartasIgualesEnSuValor() {
		// exercise
		boolean tieneDosCartasIguales = this.poker.verificar("1P", "1C", "2D", "3T", "4T");
		
		// verify
		assertTrue(tieneDosCartasIguales);
	}

}
