package ar.edu.unq.po2.tp9;

public abstract class LlamadaTelefonica {
	
	private int tiempo;
	private int horaDelDia;
	
	public LlamadaTelefonica(int tiempo, int horaDelDia) {
		this.tiempo=tiempo;
		this.horaDelDia=horaDelDia;
	}
	
	public int getTiempo() {
		return this.tiempo;
	}
	
	public int getHoraDelDia() {
		return this.horaDelDia;
	}
	
	public abstract boolean esHoraPico();
	
	public float costoFinal() {	//templeate method
		if(this.esHoraPico()) {
			return this.costoNeto()*1.2f*this.getTiempo();
		} else {
			return this.costoNeto()*this.getTiempo();
		}
	}
	
	public float costoNeto() {	//hook method
		return this.getTiempo()*1;
	}

}
