package ar.edu.unq.po2.tp11;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp3.Point;

public class Caballero extends Personaje {

	public Caballero(Point punto) {
		super(punto);
	}

	@Override
	public void caminar(Point punto) {
		super.setPunto(punto);
	}

}
