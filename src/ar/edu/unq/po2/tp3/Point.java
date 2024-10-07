package ar.edu.unq.po2.tp3;


/**
 * 
 */
public class Point {
	
	private float coordenadaX;
	private float coordenadaY;
	
	public Point() {
		super();
	}
	
	public Point(float x, float y) {
		this.coordenadaX=x;
		this.coordenadaY=y;
	}
	
	public void moverPunto(float x, float y) {
		this.coordenadaX=x;
		this.coordenadaY=y;
	}
	
	public void sumarConOtroPunto(Point punto) {
		this.coordenadaX += punto.getCoordenadaX();
		this.coordenadaY += punto.getCoordenadaY();
	}
	
	public float getCoordenadaX() {
		return this.coordenadaX;
	}
	
	public float getCoordenadaY() {
		return this.coordenadaY;
	}

}
