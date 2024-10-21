package ar.edu.unq.po2.tp10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EncriptadorNaiveTestCase {
	
	private EncriptadorNaive encriptador;
	private EncriptadorPorVocales encriptadorVocales;
	private EncriptadorPorNumeros encriptadorNumeros;

	@BeforeEach
	void setUp() {
		this.encriptador = new EncriptadorNaive();
		this.encriptadorVocales = new EncriptadorPorVocales();
		this.encriptadorNumeros = new EncriptadorPorNumeros();
	}

	@Test
	void testUnEncriptadorNaivePorOrdenEncriptaUnTexto() {
		String textoEncriptado = this.encriptador.encriptar("Un teXto A testEar");
		String textoEsperado = "testEar A teXto Un";
		
		assertEquals(textoEsperado, textoEncriptado);
	}
	
	@Test
	void testUnEncriptadorNaivePorOrdenDesencriptaUnTexto() {
		String textoDesencriptado = this.encriptador.desencriptar("DeSeNCRiptar a TEXTO otro");
		String textoEsperado = "otro TEXTO a DeSeNCRiptar";
		
		assertEquals(textoEsperado, textoDesencriptado);
	}
	
	@Test
	void testUnEncriptadorNaivePorVocalesEncriptaUnTexto() {
		this.encriptador.setEncriptador(this.encriptadorVocales);
		String textoEncriptado = this.encriptador.encriptar("AEIOU y aueua");
		String textoEsperado = "EIOUA y eaiae";
		//no pasa el test tiene un error raro
		assertEquals(textoEsperado, textoEncriptado);
	}
	
	@Test
	void testUnEncriptadorNaivePorVocalesDesencriptaUnTexto() {
		this.encriptador.setEncriptador(this.encriptadorVocales);
		String textoDesencriptado = this.encriptador.desencriptar("EIOUA y eaiae");
		String textoEsperado = "AEIOU y aueua";
		//no pasa el test tiene un error raro
		assertEquals(textoEsperado, textoDesencriptado);
	}
	
	@Test
	void testUnEncriptadorNaivePorNumerosEncriptaUnTexto() {
		this.encriptador.setEncriptador(this.encriptadorNumeros);
		String textoEncriptado = this.encriptador.encriptar("Diego");
		String textoEsperado = "4,9,5,7,15";
		
		assertEquals(textoEsperado, textoEncriptado);
	}
	
	@Test
	void testUnEncriptadorNaivePorNumerosDesencriptaUnTexto() {
		this.encriptador.setEncriptador(this.encriptadorNumeros);
		String textoDesencriptado = this.encriptador.desencriptar("4,9,5,7,15");
		String textoEsperado = "diego";
		
		assertEquals(textoEsperado, textoDesencriptado);
	}

}
