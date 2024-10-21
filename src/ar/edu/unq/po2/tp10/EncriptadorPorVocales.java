package ar.edu.unq.po2.tp10;

public class EncriptadorPorVocales extends Encriptador {

	@Override
	public String encriptar(String texto) {
		StringBuilder textoEncriptado = new StringBuilder();
		for(int i=0; i<texto.length(); i++) {
			char letra = texto.charAt(i);
			textoEncriptado.insert(i, letra);
			if(letra == 'A') textoEncriptado.insert(i, 'E');
			if(letra == 'E') textoEncriptado.insert(i, 'I');
			if(letra == 'I') textoEncriptado.insert(i, 'O');
			if(letra == 'O') textoEncriptado.insert(i, 'U');
			if(letra == 'U') textoEncriptado.insert(i, 'A');
			if(letra == 'a') textoEncriptado.insert(i, 'e');
			if(letra == 'e') textoEncriptado.insert(i, 'i');
			if(letra == 'i') textoEncriptado.insert(i, 'o');
			if(letra == 'o') textoEncriptado.insert(i, 'u');
			if(letra == 'u') textoEncriptado.insert(i, 'a');
		}
		return textoEncriptado.toString();
	}

	@Override
	public String desencriptar(String texto) {
		StringBuilder textoDesencriptado = new StringBuilder();
		for(int i=0; i<texto.length(); i++) {
			char letra = texto.charAt(i);
			textoDesencriptado.insert(i, letra);
			if(letra == 'A') textoDesencriptado.insert(i, 'U');
			if(letra == 'E') textoDesencriptado.insert(i, 'A');
			if(letra == 'I') textoDesencriptado.insert(i, 'E');
			if(letra == 'O') textoDesencriptado.insert(i, 'I');
			if(letra == 'U') textoDesencriptado.insert(i, 'O');
			if(letra == 'a') textoDesencriptado.insert(i, 'u');
			if(letra == 'e') textoDesencriptado.insert(i, 'a');
			if(letra == 'i') textoDesencriptado.insert(i, 'e');
			if(letra == 'o') textoDesencriptado.insert(i, 'i');
			if(letra == 'u') textoDesencriptado.insert(i, 'o');
		}
		return textoDesencriptado.toString();
	}

}
