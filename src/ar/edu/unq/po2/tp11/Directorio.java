package ar.edu.unq.po2.tp11;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Directorio extends NodoFS {
	
	private Date fechaDeCreacion;
	private List<NodoFS> contenido;

	public Directorio(String nombre) {
		super(nombre);
		this.contenido=new ArrayList<NodoFS>();
	}
	
	public Date getFecha() {
		return this.fechaDeCreacion;
	}
	
	public List<NodoFS> getContenido() {
		return this.contenido;
	}
	
	public void agregar(NodoFS contenido) {
		this.contenido.add(contenido);
	}
	
	public void sacar(NodoFS contenido) {
		this.contenido.remove(contenido);
	}
	
	public NodoFS getNodoFS(int i) {
		return this.contenido.get(i);
	}

	@Override
	public int totalSize() {
		int numero = this.contenido.stream()
				.mapToInt(contenido -> contenido.totalSize())
				.sum();
		return numero;
	}

	@Override
	public void printStructure() {
		// TODO Auto-generated method stub

	}

	@Override
	public NodoFS lastModified() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NodoFS oldestElement() {
		// TODO Auto-generated method stub
		return null;
	}

}
