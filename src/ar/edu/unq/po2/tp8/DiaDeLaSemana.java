package ar.edu.unq.po2.tp8;

public enum DiaDeLaSemana {
	
	LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;
	
	public int costoDeLaActividad() {
		int costo = (this.esLunes() | this.esMartes() | this.esMiercoles()) ? 500 : 1000;
		return costo;
	}
	
	private boolean esLunes() {
		return (this==LUNES);
	}
	
	private boolean esMartes() {
		return (this==MARTES);
	}
	
	private boolean esMiercoles() {
		return (this==MIERCOLES);
	}

}
