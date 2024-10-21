package ar.edu.unq.po2.tp10;

public class IngresandoFichas extends EstadoMaquina {
	
	private static IngresandoFichas uniqueInstance;
	
	private IngresandoFichas() {
		super();
	}
	
	public static IngresandoFichas getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new IngresandoFichas();
		}
		return uniqueInstance;
	}

	@Override
	public void presionarBotonDeInicio(MaquinaDeVideoJuego maquina) {
		if(maquina.getCantidadDeFichas() == 1) {
			maquina.setEstado(UnJugador.getInstance());
		}
		if(maquina.getCantidadDeFichas() == 2) {
			maquina.setEstado(DosJugadores.getInstance());
		}
	}

	@Override
	public void ingresarFicha(MaquinaDeVideoJuego maquina) {
		maquina.incrementarFichasIngresadas();
	}

	@Override
	public void terminarJuego(MaquinaDeVideoJuego maquina) {
		
	}

}
