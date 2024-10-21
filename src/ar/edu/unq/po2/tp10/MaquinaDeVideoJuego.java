package ar.edu.unq.po2.tp10;

public class MaquinaDeVideoJuego {
	
	private Control controlJugadorUno;
	private Control controlJugadorDos;
	private Boton botonDeInicio;
	private Ranura ranura;
	private EstadoMaquina estado;
	private int cantidadDeFichasIngresadas;
	
	public MaquinaDeVideoJuego(Control controlUno, Control controlDos, Boton boton, Ranura ranura) {
		this.controlJugadorUno=controlUno;
		this.controlJugadorDos=controlDos;
		this.botonDeInicio=boton;
		this.ranura=ranura;
		this.cantidadDeFichasIngresadas=0;
		this.estado=Encendido.getInstance();
	}
	
	public void presionarBotonDeInicio() {
		this.estado.presionarBotonDeInicio(this);
	}
	
	public void ingresarFicha() {
		this.estado.ingresarFicha(this);
	}
	
	public void terminarJuego() {
		this.estado.terminarJuego(this);
	}
	
	public void incrementarFichasIngresadas() {
		this.cantidadDeFichasIngresadas++;
	}
	
	public void resetearFichasIngresadas() {
		this.cantidadDeFichasIngresadas=0;
	}
	
	public int getCantidadDeFichas() {
		return this.cantidadDeFichasIngresadas;
	}
	
	public void setEstado(EstadoMaquina estado) {
		this.estado=estado;
	}
	
	public EstadoMaquina getEstado() {
		return this.estado;
	}

}
