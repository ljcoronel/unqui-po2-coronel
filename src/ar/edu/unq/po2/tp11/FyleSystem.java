package ar.edu.unq.po2.tp11;

public interface FyleSystem {
	/**
	* Retorna el total ocupado en disco del receptor. Expresado en
	*cantidad de bytes.
	*/
	public int totalSize();
	/**
	* Imprime en consola el contenido indicando el nombre del elemento
	* e indentandolo con tantos espacios como profundidad en la estructura.
	*/
	public void printStructure();
	
	/**
	* Elemento mas nuevo
	*/
	public NodoFS lastModified();
	
	/** Elemento mas antiguo
	*/
	public NodoFS oldestElement();
}
