package ar.edu.unq.po2.tp11;

import java.util.Date;

public class Archivo extends NodoFS {
	
	private int tamaño;
	private Date fechaDeModificacion;

	public Archivo(String nombre, Date fecha) {
		super(nombre);
		this.tamaño=0;
		this.fechaDeModificacion=fecha;
	}
	
	public Date getFecha() {
		return this.fechaDeModificacion;
	}
	
	public void modificar(Date fecha, int tamaño) {
		this.fechaDeModificacion=fecha;
		this.tamaño=tamaño;
	}

	@Override
	public int totalSize() {
		return this.tamaño;
	}

	@Override
	public void printStructure() {
		System.out.println(super.getNombre());
	}

	@Override
	public NodoFS lastModified() {
		return this;
	}

	@Override
	public NodoFS oldestElement() {
		return this;
	}

}
