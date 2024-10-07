package ar.edu.unq.po2.tp9;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MismaLetraInicialTestCase {
	
	private MismaLetraInicial filtro;
	private WikipediaPage paginaParticular;
	private WikipediaPage paginaUno;
	private WikipediaPage paginaDos;
	private WikipediaPage paginaTres;
	private List<WikipediaPage> paginas = new ArrayList<WikipediaPage>();

	@BeforeEach
	void setUp() {
		this.filtro = new MismaLetraInicial();
		this.paginaUno = mock(WikipediaPage.class);
		this.paginaDos = mock(WikipediaPage.class);
		this.paginaTres = mock(WikipediaPage.class);
		this.paginas.add(this.paginaUno);
		this.paginas.add(this.paginaDos);
		this.paginas.add(this.paginaTres);
	}

	@Test
	void testUnFiltroDeMismaLetraInicial() {
		fail("Not yet implemented");
	}

}
