package ar.edu.unq.po2.tp7;

import java.util.Arrays;
import java.util.List;

public class PokerStatus {
	
	public boolean verificar(String primeraCarta, String segundaCarta, String terceraCarta, String cuartaCarta, String quintaCarta) {
		List<String> cartas = Arrays.asList(primeraCarta, segundaCarta, terceraCarta, cuartaCarta, quintaCarta);
		int cantidadDeCartasDeUno = cartas.stream()
				.filter(carta->carta.startsWith("1"))
				.;
		int cantidadDeCartasDeDos = cartas.stream()
				.filter(carta->carta.startsWith("2"))
				.count();
		int cantidadDeCartasDeTres = cartas.stream()
				.filter(carta->carta.startsWith("3"))
				.count();
		int cantidadDeCartasDeCuatro = cartas.stream()
				.filter(carta->carta.startsWith("4"))
				.count();
		int cantidadDeCartasDeCinco = cartas.stream()
				.filter(carta->carta.startsWith("5"))
				.count();
		int cantidadDeCartasDeSeis = cartas.stream()
				.filter(carta->carta.startsWith("6"))
				.count();
		int cantidadDeCartasDeSiete = cartas.stream()
				.filter(carta->carta.startsWith("7"))
				.count();
		int cantidadDeCartasDeOcho = cartas.stream()
				.filter(carta->carta.startsWith("8"))
				.count();
		int cantidadDeCartasDeNueve = cartas.stream()
				.filter(carta->carta.startsWith("9"))
				.count();
		int cantidadDeCartasDeDiez = cartas.stream()
				.filter(carta->carta.startsWith("10"))
				.count();
		int cantidadDeCartasDeJ = cartas.stream()
				.filter(carta->carta.startsWith("J"))
				.count();
		int cantidadDeCartasDeQ = cartas.stream()
				.filter(carta->carta.startsWith("Q"))
				.count();
		int cantidadDeCartasDeK = cartas.stream()
				.filter(carta->carta.startsWith("K"))
				.count();
		
		return (cantidadDeCartasDeUno >=4 
				|| cantidadDeCartasDeDos >=4 
				|| cantidadDeCartasDeTres >=4 
				|| cantidadDeCartasDeCuatro >=4 
				|| cantidadDeCartasDeCinco >=4 
				|| cantidadDeCartasDeSeis >=4 
				|| cantidadDeCartasDeSiete >=4);
	}
	
}
