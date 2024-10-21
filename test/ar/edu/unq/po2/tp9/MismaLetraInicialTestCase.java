package ar.edu.unq.po2.tp9;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MismaLetraInicialTestCase {
	
	private MismaLetraInicial filtro;
	private WikipediaPage paginaLaPlata;
	private WikipediaPage paginaLucasArt;
	private WikipediaPage paginaLobo;
	private WikipediaPage paginaBuenosAires;
	private List<WikipediaPage> paginas = new ArrayList<WikipediaPage>();

	@BeforeEach
	void setUp() {
		this.filtro = new MismaLetraInicial();
		this.paginaLaPlata = mock(WikipediaPage.class);
		this.paginaLucasArt = mock(WikipediaPage.class);
		this.paginaLobo = mock(WikipediaPage.class);
		this.paginaBuenosAires = mock(WikipediaPage.class);
		this.paginas.add(this.paginaLucasArt);
		this.paginas.add(this.paginaLobo);
		this.paginas.add(this.paginaBuenosAires);
	}

	@Test
	void testUnFiltroDeMismaLetraInicialObtieneLasPaginasConLaMismaPrimeraLetraQueUnaPaginaEnParticular() {
		when(this.paginaLaPlata.getTitle()).thenReturn("La Plata");
		when(this.paginaLucasArt.getTitle()).thenReturn("Lucas Art");
		when(this.paginaLobo.getTitle()).thenReturn("Lobo");
		when(this.paginaBuenosAires.getTitle()).thenReturn("Buenos Aires");
		List<WikipediaPage> paginasFiltradas = this.filtro.getSimilarPages(this.paginaLaPlata, this.paginas);
		
		assertTrue(paginasFiltradas.contains(this.paginaLucasArt));
		assertTrue(paginasFiltradas.contains(this.paginaLobo));
		assertFalse(paginasFiltradas.contains(this.paginaBuenosAires));
	}

}
