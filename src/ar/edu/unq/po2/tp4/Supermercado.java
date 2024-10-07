package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	
	private String nombre;
	private String direccion;
	private List<Producto> productos = new ArrayList<Producto>();
	
	public Supermercado(String nombre, String direccion) {
		this.nombre=nombre;
		this.direccion=direccion;
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	public int getCantidadDeProductos() {
		return (this.productos.size());
	}
	
	public double getPrecioTotal() {
		double precio = 0;
		for (int i=0; i<this.productos.size(); i++) {
			precio += this.productos.get(i).getPrecio();
		}
		return precio;
	}

}
