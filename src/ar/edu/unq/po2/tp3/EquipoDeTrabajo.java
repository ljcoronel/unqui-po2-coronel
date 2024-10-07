package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	
	private String nombre;
	private List<PersonaV2> integrantes= new ArrayList<PersonaV2>();
	
	public EquipoDeTrabajo(String nombre) {
		this.nombre=nombre;
	}
	
	public void agregarIntegrante(PersonaV2 persona) {
		this.integrantes.add(persona);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public float promedioDeEdad() {
		float sumatoriaDeEdad= 0;
		for (int i=0; i<this.integrantes.size(); i++) {
			sumatoriaDeEdad+= (this.integrantes.get(i)).getEdad();
		}
		return (sumatoriaDeEdad/this.integrantes.size());
	}

}
