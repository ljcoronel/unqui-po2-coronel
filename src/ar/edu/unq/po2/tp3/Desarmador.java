package ar.edu.unq.po2.tp3;

import java.util.List;

/**
 * recibe un arreglo de números enteros y devuelva el número que tiene la mayor cantidad de
 * dígitos pares.
 */
public class Desarmador {
	
	private int numeroConMasDigitosPares;
	private int mayorCantidadDePares;
	
	public Desarmador() {
		this.numeroConMasDigitosPares=0;
		this.mayorCantidadDePares=0;
	}
	
	public int numeroConMayorCantidadDeDigitosPares() {
		return this.numeroConMasDigitosPares;
	}
	
	public void calcularNumeroConMayorCantidadDeDigitosPares(List<Integer> numeros) {
		for (int i=0; i<numeros.size(); i++) {
			this.calcularDigitosPares(numeros.get(i));
		}
	}
	
	private void calcularDigitosPares(int numero) {
		int digitosPares=0;
		int k=numero;
		while (k/10 != 0) {
			digitosPares = this.contarDigitoPar(k%10, digitosPares);
			k = k/10;
		}
		digitosPares = this.contarDigitoPar(k%10, digitosPares);
		this.compararCantidadDePares(numero, digitosPares);
	}
	
	private int contarDigitoPar(int numero, int digitosPares) {
		if (numero%2 == 0) {
			return ++digitosPares;
		}
		return digitosPares;
	}
	
	private void compararCantidadDePares(int numero, int digitosPares) {
		if (this.mayorCantidadDePares < digitosPares) {
			this.numeroConMasDigitosPares=numero;
		}
	}

}
