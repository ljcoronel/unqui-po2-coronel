package ar.edu.unq.po2.tp5;

import java.util.List;

public class Caja {
	
	public double registrarRegistrables(List<Registrable> registrables) {
		double monto = 0;
		for(int i=0; i<registrables.size(); i++) {
			monto += registrables.get(i).montoAPagar();
			registrables.get(i).registrar();
		}
		return monto;
	}

}
