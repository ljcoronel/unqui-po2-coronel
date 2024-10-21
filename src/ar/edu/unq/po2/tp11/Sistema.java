package ar.edu.unq.po2.tp11;

public class Sistema {
	
	private Parcela parcela;
	
	public Sistema(Parcela parcela) {
		this.parcela=parcela;
	}
	
	public int gananciaAnual() {
		return parcela.gananciaAnual();
	}

}
