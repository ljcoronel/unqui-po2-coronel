package ar.edu.unq.po2.tp10;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaquinaDeVideoJuegoTestCase {
	
	private MaquinaDeVideoJuego maquina;
	private Control controlUno;
	private Control controlDos;
	private Boton botonDeInicio;
	private Ranura ranura;

	@BeforeEach
	void setUp() {
		this.controlUno = mock(Control.class);
		this.controlDos = mock(Control.class);
		this.botonDeInicio = mock(Boton.class);
		this.ranura = mock(Ranura.class);
		this.maquina = new MaquinaDeVideoJuego(this.controlUno, this.controlDos, this.botonDeInicio, this.ranura);
	}

	@Test
	void test() {
		assertEquals(maquina.getEstado(), Encendido.getInstance());
	}

}
