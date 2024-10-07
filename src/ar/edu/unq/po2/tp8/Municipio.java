package ar.edu.unq.po2.tp8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Municipio {
	
	private List<ActividadSemanal> actividades = new ArrayList<ActividadSemanal>();
	
	public void registrarActividad(ActividadSemanal actividad) {
		this.actividades.add(actividad);
	}
	
	public List<ActividadSemanal> actividadesDeFutbol() {
		List<ActividadSemanal> actividades = this.actividades.stream()
				.filter(actividad -> actividad.esDeFutbol())
				.toList();
		return actividades;
	}
	
	public List<ActividadSemanal> actividadesDeComplejidad(int complejidad) {
		List<ActividadSemanal> actividades = this.actividades.stream()
				.filter(actividad -> actividad.esDeComplejidad(complejidad))
				.toList();
		return actividades;
	}
	
	public int cantidadDeHorasTotales() {
		int cantidad = this.actividades.stream()
				.mapToInt(actividad -> actividad.getDuracion())
				.sum();
		return cantidad;
	}
	
	public ActividadSemanal actividadDeMenorCosto(Deporte deporte) {
		Comparator<ActividadSemanal> comparador;
		ActividadSemanal actividadSeleccionada = this.actividades.stream()
				.filter(actividad -> actividad.esDeporte(deporte))
				.min(comparador.;
	}

}
