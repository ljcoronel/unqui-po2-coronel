package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTestCase {
	
	private Banco banco;
	private Cliente clienteUno;
	private Cliente clienteDos;
	private Cliente clienteTres;
	private Cliente clienteCuatro;
	private SolicitudDeCredito solicitudUno;
	private SolicitudDeCredito solicitudDos;
	private SolicitudDeCredito solicitudTres;
	private SolicitudDeCredito solicitudCuatro;

	@BeforeEach
	void setUp() {
		this.clienteUno = mock(Cliente.class);
		this.clienteDos = mock(Cliente.class);
		this.clienteTres = mock(Cliente.class);
		this.clienteCuatro = mock(Cliente.class);
		this.solicitudUno = mock(SolicitudDeCredito.class);
		this.solicitudDos = mock(SolicitudDeCredito.class);
		this.solicitudTres = mock(SolicitudDeCredito.class);
		this.solicitudCuatro = mock(SolicitudDeCredito.class);
		this.banco = new Banco();
	}

	@Test
	void testUnBancoDevuelveElMontoTotalADesembolsar() {
		when(this.solicitudUno.getCliente()).thenReturn(this.clienteUno);
		when(this.solicitudDos.getCliente()).thenReturn(this.clienteDos);
		when(this.solicitudTres.getCliente()).thenReturn(this.clienteTres);
		when(this.solicitudCuatro.getCliente()).thenReturn(this.clienteCuatro);
		when(this.solicitudUno.esAceptable()).thenReturn(true);
		when(this.solicitudDos.esAceptable()).thenReturn(true);
		when(this.solicitudTres.esAceptable()).thenReturn(false);
		when(this.solicitudUno.getMontoSolicitado()).thenReturn(1000d);
		when(this.solicitudDos.getMontoSolicitado()).thenReturn(2000d);
		this.banco.agregarCliente(this.clienteUno);
		this.banco.agregarCliente(this.clienteDos);
		this.banco.agregarCliente(this.clienteTres);
		this.banco.agregarSolicitudDeCredito(this.solicitudUno);
		this.banco.agregarSolicitudDeCredito(this.solicitudDos);
		this.banco.agregarSolicitudDeCredito(this.solicitudTres);
		this.banco.agregarSolicitudDeCredito(this.solicitudCuatro);
		Double monto = this.banco.montoADesembolsar();
		
		assertEquals(3000, monto);
	}

}
