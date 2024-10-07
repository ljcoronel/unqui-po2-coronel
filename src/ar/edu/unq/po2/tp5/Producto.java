package ar.edu.unq.po2.tp5;

public abstract class Producto implements Registrable{
	
	private double precio;
	private int stock;
	
	public Producto(double precio, int stock) {
		this.precio=precio;
		this.stock=stock;
	}
	
	public double montoAPagar() {
		return (this.precio);
	}
	
	public void registrar() {
		this.decrementarCantidad();
	}
	
	protected void decrementarCantidad() {
		this.stock--;
	}

}
