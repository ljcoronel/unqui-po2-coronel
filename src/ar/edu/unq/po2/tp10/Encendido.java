package ar.edu.unq.po2.tp10;

public class Encendido extends EstadoMaquina {
	
	private static Encendido uniqueInstance;
	
	private Encendido() {
		super();
	}
	
	public static Encendido getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Encendido();
		}
		return uniqueInstance;
	}

	@Override
	public void presionarBotonDeInicio(MaquinaDeVideoJuego maquina) {
		maquina.setEstado(IngresandoFichas.getInstance());
	}

	@Override
	public void ingresarFicha(MaquinaDeVideoJuego maquina) {
		
	}

	@Override
	public void terminarJuego(MaquinaDeVideoJuego maquina) {
		
	}

}
