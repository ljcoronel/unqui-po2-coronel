package ar.edu.unq.po2.tp3;
import java.util.ArrayList;
import java.util.List;

/**
 * a partir de un ArrayList que mantiene como variable privada, sea capaz de contar:
 * La cantidad de pares,
 * La cantidad de impares,
 * La cantidad de múltiplos de un cierto número.
 */
public class Counter {
	
	private List<Integer> numeros= new ArrayList<Integer>();
	private int cantidadDePares;
	private int cantidadDeImpares;
	
	public Counter() {
		this.cantidadDePares=0;
		this.cantidadDeImpares=0;
	}
	
	public void agregarNumero(int numero) {
		this.numeros.add(numero);
	}
	
	private void contarPares() {
		for (int i=0; i<this.numeros.size(); i++) {
			this.contarSiEsPar(this.numeros.get(i));
		}
	}
	
	private void contarImpares() {
		for (int i=0; i<this.numeros.size(); i++) {
			this.contarSiEsImpar(this.numeros.get(i));
		}
	}
	
	private void contarSiEsPar(int numero) {
		if (numero%2 == 0) {
			this.cantidadDePares++;
		}
	}
	
	private void contarSiEsImpar(int numero) {
		if (numero%2 != 0) {
			this.cantidadDeImpares++;
		}
	}
	
	public int getCantidadDePares() {
		this.contarPares();
		return this.cantidadDePares;
	}
	
	public int getCantidadDeImpares() {
		this.contarImpares();
		return this.cantidadDeImpares;
	}
	
	private int cantidadDeNumerosMultiploDe(int numero) {
		int k=0;
		for (int i=0; i<this.numeros.size(); i++) {
			if (this.numeros.get(i)%numero == 0) {
				k++;
			}
		}
		return k;
	}
	
	public int getCantidadDeNumerosMultiploDe(int numero) {
		return this.cantidadDeNumerosMultiploDe(numero);
	}

}
