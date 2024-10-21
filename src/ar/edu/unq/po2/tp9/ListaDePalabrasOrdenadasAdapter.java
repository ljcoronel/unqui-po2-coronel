package ar.edu.unq.po2.tp9;

import javax.swing.DefaultListModel;

public class ListaDePalabrasOrdenadasAdapter extends DefaultListModel {
	
	private ListaDePalabrasOrdenadas palabras;
	
	public ListaDePalabrasOrdenadasAdapter() {
		this.palabras = new ListaDePalabrasOrdenadas();
	}
	
	public void addElement(String palabra) {
		this.palabras.agregarPalabra(palabra);
	}

}
