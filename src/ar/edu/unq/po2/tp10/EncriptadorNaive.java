package ar.edu.unq.po2.tp10;

public class EncriptadorNaive {
	
	private Encriptador formaDeEncriptar;
	
	public EncriptadorNaive() {
		this.formaDeEncriptar = new EncriptadorPorOrden();
	}
	
	public String encriptar(String texto) {
		return (this.formaDeEncriptar.encriptar(texto));
	}
	
	public String desencriptar(String texto) {
		return (this.formaDeEncriptar.desencriptar(texto));
	}
	
	public void setEncriptador(Encriptador encriptador) {
		this.formaDeEncriptar=encriptador;
	}

}
