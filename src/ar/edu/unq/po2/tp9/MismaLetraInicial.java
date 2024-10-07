package ar.edu.unq.po2.tp9;

public class MismaLetraInicial extends Filtro {
	
	@Override
	protected boolean sonSimilares(WikipediaPage paginaParticular, WikipediaPage paginaAComparar) {
		return (paginaParticular.getTitle().startsWith(paginaAComparar.getTitle()));
	}

}
