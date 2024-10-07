package ar.edu.unq.po2.tp3;


/**
 * una función que reciba dos valores X e Y, y devuelva el número más alto entre 0 y 1000,
 * que sea múltiplo simultáneamente de X e Y. Si no existe, devuelve -1
 */
public class Multiplo {
	
	private int x;
	private int y;
	
	public Multiplo(int n1, int n2) {
		this.x=n1;
		this.y=n2;
	}
	
	public int mayorComunMultiplo() {
		int k = 999;
		while (k!=0 & !(this.esMultiploDeXeY(k))) {
			k--;
		}
		if (k==0) {
			return (-1);
		}
		return (k);
	}
	
	private boolean esMultiploDeXeY(int numero) {
		return (numero%this.x==0 & numero%this.y==0);
	}

}
