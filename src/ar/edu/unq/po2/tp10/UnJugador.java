package ar.edu.unq.po2.tp10;

public class UnJugador extends EstadoMaquina {
	
	private static UnJugador uniqueInstance;
	
	private UnJugador() {
		super();
	}
	
	public static UnJugador getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new UnJugador();
		}
		return uniqueInstance;
	}

	@Override
	public void presionarBotonDeInicio(MaquinaDeVideoJuego maquina) {
		
	}

	@Override
	public void ingresarFicha(MaquinaDeVideoJuego maquina) {
		
	}

	@Override
	public void terminarJuego(MaquinaDeVideoJuego maquina) {
		maquina.resetearFichasIngresadas();
		maquina.setEstado(Encendido.getInstance());
	}

}
