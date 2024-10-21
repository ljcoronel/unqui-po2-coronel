package ar.edu.unq.po2.tp9;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropiedadEnComunTestCase {
	
	private PropiedadEnComun filtro;
	private WikipediaPage paginaParticular;
	private WikipediaPage paginaACompararUno;
	private WikipediaPage paginaACompararDos;
	private WikipediaPage paginaGimnasia;
	private WikipediaPage paginaLaPlata;
	private WikipediaPage paginaLobo;
	private WikipediaPage paginaBuenosAires;
	private WikipediaPage paginaLucasArt;
	private List<WikipediaPage> paginas = new ArrayList<WikipediaPage>();
	private Map<String, WikipediaPage> infoboxParticular = new HashMap<String, WikipediaPage>();
	private Map<String, WikipediaPage> infoboxACompararUno = new HashMap<String, WikipediaPage>();
	private Map<String, WikipediaPage> infoboxACompararDos = new HashMap<String, WikipediaPage>();

	@BeforeEach
	void setUp() {
		this.filtro = new PropiedadEnComun();
		this.paginaParticular = mock(WikipediaPage.class);
		this.paginaACompararUno = mock(WikipediaPage.class);
		this.paginaACompararDos = mock(WikipediaPage.class);
		this.paginaGimnasia = mock(WikipediaPage.class);
		this.paginaLaPlata = mock(WikipediaPage.class);
		this.paginaLobo = mock(WikipediaPage.class);
		this.paginaBuenosAires = mock(WikipediaPage.class);
		this.paginaLucasArt = mock(WikipediaPage.class);
		this.paginas.add(this.paginaACompararUno);
		this.paginas.add(this.paginaACompararDos);
		this.infoboxParticular.put("birth_place", this.paginaLaPlata);
		this.infoboxParticular.put("place", this.paginaGimnasia);
		this.infoboxACompararUno.put("birth_place", this.paginaLucasArt);
		this.infoboxACompararUno.put("birth", this.paginaLobo);
		this.infoboxACompararDos.put("birth", this.paginaBuenosAires);
	}

	@Test
	void testUnFiltroDePropiedadEnComunObtieneLasPaginasQuePoseanAlMenosUnInfoboxEnComunDeUnaPaginaParticular() {
		when(this.paginaParticular.getInfobox()).thenReturn(this.infoboxParticular);
		when(this.paginaACompararUno.getInfobox()).thenReturn(this.infoboxACompararUno);
		when(this.paginaACompararDos.getInfobox()).thenReturn(this.infoboxACompararDos);
		List<WikipediaPage> paginasFiltradas = this.filtro.getSimilarPages(this.paginaParticular, this.paginas);
		
		assertTrue(paginasFiltradas.contains(this.paginaACompararUno));
		assertFalse(paginasFiltradas.contains(this.paginaACompararDos));
	}

}
