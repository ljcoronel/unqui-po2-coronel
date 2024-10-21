package ar.edu.unq.po2.tp10;

public class EncriptadorPorNumeros extends Encriptador {

	@Override
	public String encriptar(String texto) {
		StringBuilder textoPorNumeros = new StringBuilder();
		for(int i=0; i<texto.length(); i++) {
			char letra = texto.charAt(i);
			if(letra == ' ') textoPorNumeros.append("0,");
			if(letra == 'A' || letra == 'a') textoPorNumeros.append("1,");
			if(letra == 'B' || letra == 'b') textoPorNumeros.append("2,");
			if(letra == 'C' || letra == 'c') textoPorNumeros.append("3,");
			if(letra == 'D' || letra == 'd') textoPorNumeros.append("4,");
			if(letra == 'E' || letra == 'e') textoPorNumeros.append("5,");
			if(letra == 'F' || letra == 'f') textoPorNumeros.append("6,");
			if(letra == 'G' || letra == 'g') textoPorNumeros.append("7,");
			if(letra == 'H' || letra == 'h') textoPorNumeros.append("8,");
			if(letra == 'I' || letra == 'i') textoPorNumeros.append("9,");
			if(letra == 'J' || letra == 'j') textoPorNumeros.append("10,");
			if(letra == 'K' || letra == 'k') textoPorNumeros.append("11,");
			if(letra == 'L' || letra == 'l') textoPorNumeros.append("12,");
			if(letra == 'M' || letra == 'm') textoPorNumeros.append("13,");
			if(letra == 'N' || letra == 'n') textoPorNumeros.append("14,");
			if(letra == 'O' || letra == 'o') textoPorNumeros.append("15,");
			if(letra == 'P' || letra == 'p') textoPorNumeros.append("16,");
			if(letra == 'Q' || letra == 'q') textoPorNumeros.append("17,");
			if(letra == 'R' || letra == 'r') textoPorNumeros.append("18,");
			if(letra == 'S' || letra == 's') textoPorNumeros.append("19,");
			if(letra == 'T' || letra == 't') textoPorNumeros.append("20,");
			if(letra == 'U' || letra == 'u') textoPorNumeros.append("21,");
			if(letra == 'V' || letra == 'v') textoPorNumeros.append("22,");
			if(letra == 'W' || letra == 'w') textoPorNumeros.append("23,");
			if(letra == 'X' || letra == 'x') textoPorNumeros.append("24,");
			if(letra == 'Y' || letra == 'y') textoPorNumeros.append("25,");
			if(letra == 'Z' || letra == 'z') textoPorNumeros.append("26,");
		}
		String textoEncriptado = textoPorNumeros.deleteCharAt(textoPorNumeros.length()-1).toString();
		return textoEncriptado;
	}

	@Override
	public String desencriptar(String texto) {
		String textoDesencriptado = texto.replace("26", "z")
				.replace("25", "y")
				.replace("24", "x")
				.replace("23", "w")
				.replace("22", "v")
				.replace("21", "u")
				.replace("20", "t")
				.replace("19", "s")
				.replace("18", "r")
				.replace("17", "q")
				.replace("16", "p")
				.replace("15", "o")
				.replace("14", "n")
				.replace("13", "m")
				.replace("12", "l")
				.replace("11", "k")
				.replace("10", "j")
				.replace("9", "i")
				.replace("8", "h")
				.replace("7", "g")
				.replace("6", "f")
				.replace("5", "e")
				.replace("4", "d")
				.replace("3", "c")
				.replace("2", "b")
				.replace("1", "a")
				.replace("0", " ")
				.replace(",", "");
		return textoDesencriptado;
	}

}
