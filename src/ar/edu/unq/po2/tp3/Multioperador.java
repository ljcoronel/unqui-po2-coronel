package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

/**
 * aplica las operaciones de suma, resta y multiplicación sobre ArrayLists de enteros
 */
public class Multioperador {
	
	private List<Integer> numeros= new ArrayList<Integer>();
	
	public void agregarNumero(int numero) {
		this.numeros.add(numero);
	}
	
	public int sumatoriaDeLosNumeros() {
		int k=0;
		for (int i=0; i<this.numeros.size(); i++) {
			k+=this.numeros.get(i);
		}
		return k;
	}
	
	public int restaDeLosNumeros() {
		int k=0;
		for (int i=0; i<this.numeros.size(); i++) {
			k-=this.numeros.get(i);
		}
		return k;
	}
	
	public int productoriaDeLosNumeros() {
		if (this.numeros.isEmpty()) {
			return 0;
		}
		int k=1;
		for (int i=0; i<this.numeros.size(); i++) {
			k*=this.numeros.get(i);
		}
		return k;
	}

}
