package ar.edu.unq.po2.tp8;

public enum Deporte {
	
	RUNNING(1), FUTBOL(2), BASKET(2), TENNIS(3), JABALINA(4);
	
	private int complejidad;
	
	private Deporte(int complejidad) {
		this.setComplejidad(complejidad);
	}

	public int getComplejidad() {
		return complejidad;
	}

	public void setComplejidad(int complejidad) {
		this.complejidad = complejidad;
	}
	
	public boolean esDeporte(Deporte deporte) {
		return (this==deporte);
	}
	
	public boolean esFutbol() {
		return (this==FUTBOL);
	}

}
