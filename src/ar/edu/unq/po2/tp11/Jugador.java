package ar.edu.unq.po2.tp11;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp3.Point;

public class Jugador {
	
	private List<Personaje> personajes;
	
	public Jugador() {
		this.personajes=new ArrayList<Personaje>();
	}
	
	public void caminar(Personaje personaje, Point punto) {
		if (this.esPersonajeDelJugador(personaje)) personaje.caminar(punto);
	}
	
	private boolean esPersonajeDelJugador(Personaje personaje) {
		return (this.personajes.contains(personaje));
	}

}
