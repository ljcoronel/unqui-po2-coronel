package ar.edu.unq.po2.tp10;

public class Pausa extends EstadoReproductor {
	
	private static Pausa uniqueInstance;
	
	private Pausa() {
		super();
	}
	
	public static Pausa getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Pausa();
		}
		return uniqueInstance;
	}

	@Override
	public void reproducirCancion(Song cancion, Reproductor reproductor) {
		throw new Error();
	}

	@Override
	public void pausarReproduccion(Reproductor reproductor) {
		reproductor.getCancionSeleccionada().play();
		reproductor.setEstado(Reproduccion.getInstance());
	}

	@Override
	public void pararReproduccion(Reproductor reproductor) {
		reproductor.getCancionSeleccionada().stop();
		reproductor.setEstado(Seleccion.getInstance());
	}

}
