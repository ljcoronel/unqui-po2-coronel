package ar.edu.unq.po2.tp11;

public abstract class NodoFS implements FyleSystem{
	
	private String nombre;
	
	public NodoFS(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public abstract int totalSize();
	
	public abstract void printStructure();
	
	public abstract NodoFS lastModified();
	
	public abstract NodoFS oldestElement();

}
