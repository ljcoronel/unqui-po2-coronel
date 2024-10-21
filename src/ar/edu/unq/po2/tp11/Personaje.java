package ar.edu.unq.po2.tp11;

import ar.edu.unq.po2.tp3.Point;

public abstract class Personaje {
	
	private Point punto;
	
	public Personaje(Point punto) {
		this.punto=punto;
	}
	
	public abstract void caminar(Point punto);
	
	protected void setPunto(Point punto) {
		this.punto=punto;
	}

}
