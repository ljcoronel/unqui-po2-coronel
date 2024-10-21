package ar.edu.unq.po2.tp11;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp3.Point;

public class Ejercito extends Personaje {
	
	private List<Personaje> personajes;

	public Ejercito(Point punto) {
		super(punto);
		this.personajes=new ArrayList<Personaje>();
	}
	
	public void agregar(Personaje personaje) {
		this.personajes.add(personaje);
	}
	
	public void sacar(Personaje personaje) {
		this.personajes.remove(personaje);
	}
	
	public Personaje getPersonaje(int i) {
		return this.personajes.get(i);
	}

	@Override
	public void caminar(Point punto) {
		this.personajes.stream().forEach(personaje -> personaje.caminar(punto));
	}

}
