package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto {

	public ProductoCooperativa(double precio, int stock) {
		super(precio, stock);
	}
	
	public double montoAPagar() {
		return (this.descuentoDelIVA(super.montoAPagar()));
	}
	
	private double descuentoDelIVA(double monto) {
		return (monto * 0.9);
	}

}
