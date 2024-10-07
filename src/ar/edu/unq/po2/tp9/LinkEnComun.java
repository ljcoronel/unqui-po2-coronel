package ar.edu.unq.po2.tp9;

import java.util.List;

public class LinkEnComun extends Filtro {
	
	@Override
	protected boolean sonSimilares(WikipediaPage paginaParticular, WikipediaPage paginaAComparar) {
		List<WikipediaPage> paginasParticulares = paginaParticular.getLinks();
		List<WikipediaPage> paginasAComparar = paginaAComparar.getLinks();
		boolean tienenLinksEnComun = paginasAComparar.stream()
				.anyMatch(pagina->paginasParticulares.contains(pagina));
		return tienenLinksEnComun;
	}

}
