package ar.edu.unq.po2.tp10;

public class Reproduccion extends EstadoReproductor {
	
	private static Reproduccion uniqueInstance;
	
	private Reproduccion() {
		super();
	}
	
	public static Reproduccion getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Reproduccion();
		}
		return uniqueInstance;
	}

	@Override
	public void reproducirCancion(Song cancion, Reproductor reproductor) {
		throw new Error();
	}

	@Override
	public void pausarReproduccion(Reproductor reproductor) {
		reproductor.getCancionSeleccionada().pause();
		reproductor.setEstado(Pausa.getInstance());
	}

	@Override
	public void pararReproduccion(Reproductor reproductor) {
		reproductor.getCancionSeleccionada().stop();
		reproductor.setEstado(Seleccion.getInstance());
	}

}
