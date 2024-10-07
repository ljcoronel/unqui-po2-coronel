package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTestCase {
	
	private Caja caja;
	private Registrable registrableUno;
	private Registrable registrableDos;
	private Registrable registrableTres;
	private Registrable registrableCuatro;
	private Registrable registrableCinco;
	private List<Registrable> registrables = new ArrayList<Registrable>();

	@BeforeEach
	void setUp() {
		this.caja = new Caja();
		this.registrableUno = mock(Registrable.class);
		this.registrableDos = mock(Registrable.class);
		this.registrableTres = mock(Registrable.class);
		this.registrableCuatro = mock(Registrable.class);
		this.registrableCinco = mock(Registrable.class);
		this.registrables.add(this.registrableUno);
		this.registrables.add(this.registrableDos);
		this.registrables.add(this.registrableTres);
		this.registrables.add(this.registrableCuatro);
		this.registrables.add(this.registrableCinco);
	}

	@Test
	void testUnaCajaRecibeUnaListaDeRegistrablesEntoncesSeVerificaQueLosRegistrablesDescribanSuMontoAPagar() {
		when(registrableUno.montoAPagar()).thenReturn(75d);
		when(registrableDos.montoAPagar()).thenReturn(45d);
		when(registrableTres.montoAPagar()).thenReturn(100d);
		when(registrableCuatro.montoAPagar()).thenReturn(900d);
		when(registrableCinco.montoAPagar()).thenReturn(50d);
		Double monto = this.caja.registrarRegistrables(this.registrables);
		
		verify(this.registrableUno, atMost(1)).montoAPagar();
		verify(this.registrableUno).registrar();
		verify(this.registrableDos, atMost(1)).montoAPagar();
		verify(this.registrableDos).registrar();
		verify(this.registrableTres, atMost(1)).montoAPagar();
		verify(this.registrableTres).registrar();
		verify(this.registrableCuatro, atMost(1)).montoAPagar();
		verify(this.registrableCuatro).registrar();
		verify(this.registrableCinco, atMost(1)).montoAPagar();
		verify(this.registrableCinco).registrar();
		assertEquals(1170, monto);
	}

}
