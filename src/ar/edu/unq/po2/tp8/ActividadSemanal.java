package ar.edu.unq.po2.tp8;

public class ActividadSemanal {
	
	private DiaDeLaSemana diaDeLaSemana;
	private int horaDeInicio;
	private int duracion;
	private Deporte deporte;
	
	public ActividadSemanal(DiaDeLaSemana dia, int hora, int duracion, Deporte deporte) {
		this.diaDeLaSemana=dia;
		this.horaDeInicio=hora;
		this.duracion=duracion;
		this.deporte=deporte;
	}
	
	public int costoDeLaActividad() {
		return (this.costoPorDia() + this.costoPorComplejidad());
	}
	
	private int costoPorDia() {
		return (this.diaDeLaSemana.costoDeLaActividad() * this.duracion);
	}
	
	private int costoPorComplejidad() {
		return (this.deporte.getComplejidad() * 200);
	}
	
	public boolean esDeporte(Deporte deporte) {
		return (this.deporte.esDeporte(deporte));
	}
	
	public boolean esDeFutbol() {
		return (this.deporte.esFutbol());
	}
	
	public boolean esDeComplejidad(int complejidad) {
		return (deporte.getComplejidad() == complejidad);
	}
	
	public int getDuracion() {
		return (this.duracion);
	}

}
