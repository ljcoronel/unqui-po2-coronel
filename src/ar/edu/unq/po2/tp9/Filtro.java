package ar.edu.unq.po2.tp9;

import java.util.List;

public abstract class Filtro {
	
	public final List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		List<WikipediaPage> paginas = wikipedia.stream()
				.filter(pagina->this.sonSimilares(page, pagina))
				.toList();
		return paginas;
	}
	
	protected abstract boolean sonSimilares(WikipediaPage paginaParticular, WikipediaPage paginaAComparar);

}
