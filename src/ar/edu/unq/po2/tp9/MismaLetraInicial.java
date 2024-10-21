package ar.edu.unq.po2.tp9;

public class MismaLetraInicial extends Filtro {
	
	@Override
	protected boolean sonSimilares(WikipediaPage paginaParticular, WikipediaPage paginaAComparar) {
		char letraParticular = paginaParticular.getTitle().charAt(0);
		char letraAComparar = paginaAComparar.getTitle().charAt(0);
		return (letraParticular == letraAComparar);
	}

}
