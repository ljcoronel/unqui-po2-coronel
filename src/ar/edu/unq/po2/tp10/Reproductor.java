package ar.edu.unq.po2.tp10;

import java.util.ArrayList;
import java.util.List;

public class Reproductor {
	
	private List<Song> canciones;
	private Song cancionSeleccionada;
	private EstadoReproductor estado;
	
	public Reproductor() {
		this.canciones = new ArrayList<Song>();
		this.estado = Seleccion.getInstance();
	}
	
	public void agregarCancion(Song cancion) {
		this.canciones.add(cancion);
	}
	
	public void reproducirCancion(Song cancion) {
		this.estado.reproducirCancion(cancion, this);
	}
	
	public void pausarReproduccion() {
		this.estado.pausarReproduccion(this);
	}
	
	public void pararReproduccion() {
		this.estado.pararReproduccion(this);
	}
	
	public boolean tieneLaCancion(Song cancion) {
		return this.canciones.contains(cancion);
	}
	
	public void setCancionSeleccionada(Song cancion) {
		this.cancionSeleccionada=cancion;
	}
	
	public Song getCancionSeleccionada() {
		return this.cancionSeleccionada;
	}
	
	public void setEstado(EstadoReproductor estado) {
		this.estado=estado;
	}

}
