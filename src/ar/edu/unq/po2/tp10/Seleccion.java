package ar.edu.unq.po2.tp10;

public class Seleccion extends EstadoReproductor {
	
	private static Seleccion uniqueInstance;
	
	private Seleccion() {
		super();
	}
	
	public static Seleccion getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Seleccion();
		}
		return uniqueInstance;
	}

	@Override
	public void reproducirCancion(Song cancion, Reproductor reproductor) {
		if(reproductor.tieneLaCancion(cancion)) {
			reproductor.setCancionSeleccionada(cancion);
			reproductor.getCancionSeleccionada().play();
			reproductor.setEstado(Reproduccion.getInstance());
		}
	}

	@Override
	public void pausarReproduccion(Reproductor reproductor) {
		throw new Error();
	}

	@Override
	public void pararReproduccion(Reproductor reproductor) {
		
	}

}
