package ar.edu.unq.po2.tp9;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinkEnComunTestCase {
	
	private LinkEnComun filtro;
	private WikipediaPage paginaParticular;
	private WikipediaPage paginaACompararUno;
	private WikipediaPage paginaACompararDos;
	private WikipediaPage paginaGimnasia;
	private WikipediaPage paginaLaPlata;
	private WikipediaPage paginaBuenosAires;
	private WikipediaPage paginaLucasArt;
	private List<WikipediaPage> paginasAComparar = new ArrayList<WikipediaPage>();
	private List<WikipediaPage> linksParticulares = new ArrayList<WikipediaPage>();
	private List<WikipediaPage> linksACompararUno = new ArrayList<WikipediaPage>();
	private List<WikipediaPage> linksACompararDos = new ArrayList<WikipediaPage>();

	@BeforeEach
	void setUp() {
		this.filtro = new LinkEnComun();
		this.paginaParticular = mock(WikipediaPage.class);
		this.paginaACompararUno = mock(WikipediaPage.class);
		this.paginaACompararDos = mock(WikipediaPage.class);
		this.paginaGimnasia = mock(WikipediaPage.class);
		this.paginaLaPlata = mock(WikipediaPage.class);
		this.paginaBuenosAires = mock(WikipediaPage.class);
		this.paginaLucasArt = mock(WikipediaPage.class);
		this.paginasAComparar.add(this.paginaACompararUno);
		this.paginasAComparar.add(this.paginaACompararDos);
		this.linksParticulares.add(this.paginaGimnasia);
		this.linksParticulares.add(this.paginaLaPlata);
		//this.linksParticulares.add(this.paginaBuenosAires);
		//this.linksParticulares.add(this.paginaLucasArt);
		//this.linksACompararUno.add(this.paginaGimnasia);
		this.linksACompararUno.add(this.paginaLaPlata);
		this.linksACompararUno.add(this.paginaBuenosAires);
		//this.linksACompararUno.add(this.paginaLucasArt);
		//this.linksACompararDos.add(this.paginaGimnasia);
		//this.linksACompararDos.add(this.paginaLaPlata);
		this.linksACompararDos.add(this.paginaBuenosAires);
		this.linksACompararDos.add(this.paginaLucasArt);
	}

	@Test
	void testUnFiltroDeLinksEnComunObtieneLasPaginasQuePoseanAlMenosUnLinkAUnaPaginaEnComunDeUnaPaginaParticular() {
		when(this.paginaParticular.getLinks()).thenReturn(this.linksParticulares);
		when(this.paginaACompararUno.getLinks()).thenReturn(this.linksACompararUno);
		when(this.paginaACompararDos.getLinks()).thenReturn(this.linksACompararDos);
		List<WikipediaPage> paginasFiltradas = this.filtro.getSimilarPages(this.paginaParticular, this.paginasAComparar);
		
		assertTrue(paginasFiltradas.contains(this.paginaACompararUno));
		assertFalse(paginasFiltradas.contains(this.paginaACompararDos));
	}

}
