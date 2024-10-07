package ar.edu.unq.po2.tp9;

import java.util.Map;

public class PropiedadEnComun extends Filtro {
	
	@Override
	protected boolean sonSimilares(WikipediaPage paginaParticular, WikipediaPage paginaAComparar) {
		Map<String, WikipediaPage> infoboxParticulares = paginaParticular.getInfobox();
		Map<String, WikipediaPage> infoboxAComparar = paginaAComparar.getInfobox();
		boolean tienenPropiedadEnComun = infoboxAComparar.keySet().stream()
				.anyMatch(infobox->infoboxParticulares.containsKey(infobox));
		return tienenPropiedadEnComun;
	}

}
