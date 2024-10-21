package ar.edu.unq.po2.tp11;

import ar.edu.unq.po2.tp3.Point;

public class Ingeniero extends Personaje {
	
	private int cantidadDeLajas;
	
	public Ingeniero(Point punto, int cantidadDeLajas) {
		super(punto);
		this.cantidadDeLajas=cantidadDeLajas;
	}

	@Override
	public void caminar(Point punto) {
		super.setPunto(punto);
	}

}
