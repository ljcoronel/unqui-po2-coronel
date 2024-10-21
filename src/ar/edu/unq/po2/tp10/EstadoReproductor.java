package ar.edu.unq.po2.tp10;

public abstract class EstadoReproductor {
	
	public abstract void reproducirCancion(Song cancion, Reproductor reproductor);
	
	public abstract void pausarReproduccion(Reproductor reproductor);
	
	public abstract void pararReproduccion(Reproductor reproductor);

}
