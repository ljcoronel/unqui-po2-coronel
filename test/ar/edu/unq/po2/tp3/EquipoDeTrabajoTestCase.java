package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {
	
	private EquipoDeTrabajo equipo;
	private PersonaV2 homero;
	private PersonaV2 marge;
	private PersonaV2 bart;
	private PersonaV2 lisa;
	private PersonaV2 maggie;

	@BeforeEach
	void setUp() throws Exception {
		
		this.equipo= new EquipoDeTrabajo("Enterprise");
		this.homero= new PersonaV2("Homero", "Simpson", 38);
		this.marge= new PersonaV2("Marge", "Bouvier", 36);
		this.bart= new PersonaV2("Bart", "Simpson", 10);
		this.lisa= new PersonaV2("Lisa", "Simpson", 8);
		this.maggie= new PersonaV2("Maggie", "Simpson", 1);
		this.equipo.agregarIntegrante(homero);
		this.equipo.agregarIntegrante(marge);
		this.equipo.agregarIntegrante(bart);
		this.equipo.agregarIntegrante(lisa);
		this.equipo.agregarIntegrante(maggie);
		
	}

	@Test
	void testPromedioIntegrantes() {
		float promedioEsperado= this.equipo.promedioDeEdad();
		assertEquals(18.600000381469727, promedioEsperado);
	}

}
