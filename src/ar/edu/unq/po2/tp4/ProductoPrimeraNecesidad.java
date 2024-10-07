package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	
	private double descuento;
	
	public ProductoPrimeraNecesidad(String nombre, double precio) {
		super(nombre, precio);
		this.descuento=0.9;
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean precioCuidado) {
		super(nombre, precio, precioCuidado);
		this.descuento=0.9;
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, double descuento) {
		super(nombre, precio);
		this.descuento=descuento;
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean precioCuidado, double descuento) {
		super(nombre, precio, precioCuidado);
		this.descuento=descuento;
	}
	
	public double getPrecio() {
		return (super.getPrecio() * this.descuento);
	}

}
