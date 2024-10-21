package ar.edu.unq.po2.tp10;

public class DosJugadores extends EstadoMaquina {
	
	private static DosJugadores uniqueInstance;
	
	private DosJugadores() {
		super();
	}
	
	public static DosJugadores getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new DosJugadores();
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
