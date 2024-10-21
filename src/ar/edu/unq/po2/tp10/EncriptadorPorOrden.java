package ar.edu.unq.po2.tp10;

public class EncriptadorPorOrden extends Encriptador {

	@Override
	public String encriptar(String texto) {
		StringBuilder textoOrdenCambiado = new StringBuilder();
	    StringBuilder palabra = new StringBuilder();
	    for (int i = 0; i < texto.length(); i++) {
	        char letra = texto.charAt(i);
	        if (letra != ' ') {
	            palabra.append(letra);
	        } else {
	            textoOrdenCambiado.insert(0, letra + palabra.toString());
	            palabra.setLength(0);
	        }
	    }
	    String textoEncriptado = textoOrdenCambiado.insert(0, palabra.toString()).toString();
		return textoEncriptado;
	}

	@Override
	public String desencriptar(String texto) {
		StringBuilder textoOrdenOriginal = new StringBuilder();
	    StringBuilder palabra = new StringBuilder();
	    for (int i = 0; i < texto.length(); i++) {
	        char letra = texto.charAt(i);
	        if (letra != ' ') {
	            palabra.append(letra);
	        } else {
	            textoOrdenOriginal.insert(0, letra + palabra.toString());
	            palabra.setLength(0);
	        }
	    }
	    String textoDesencriptado = textoOrdenOriginal.insert(0, palabra.toString()).toString();
		return textoDesencriptado;
	}

}
