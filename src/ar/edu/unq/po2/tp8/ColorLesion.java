package ar.edu.unq.po2.tp8;

public enum ColorLesion {
	
	ROJO("Sangrante", 10), GRIS("mejorando", 7), AMARILLO("ya casi", 4), MIEL("recuperada", 2);
	
	private String descripcion;
	private int riesgo;
	
	private ColorLesion(String descripcion, int riesgo) {
		this.setDescripcion(descripcion);
		this.setRiesgo(riesgo);
	}
	
	public ColorLesion dameSiguienteEnMaduracion() {
		return ColorLesion.values()[(this.ordinal()+1) % (ColorLesion.values().length)];
	}

	public int getRiesgo() {
		return riesgo;
	}

	public void setRiesgo(int riesgo) {
		this.riesgo = riesgo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
