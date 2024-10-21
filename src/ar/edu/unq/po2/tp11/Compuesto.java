package ar.edu.unq.po2.tp11;

import java.util.ArrayList;
import java.util.List;

public class Compuesto extends ShapeShifter {
	
	private List<IShapeShifter> compuestos;
	private int profundidad;
	
	public Compuesto(List<IShapeShifter> shapeShifter) {
		this.compuestos=shapeShifter;
		this.profundidad=0;
	}
	
	public int getProfundidad() {
		return this.profundidad;
	}

	@Override
	public IShapeShifter compose(IShapeShifter shapeShifter) {
		List<IShapeShifter> shapeShifters = new ArrayList<IShapeShifter>();
		shapeShifters.add(this);
		shapeShifters.add(shapeShifter);
		Compuesto compuesto = new Compuesto(shapeShifters);
		this.profundidad++;
		return compuesto;
	}

	@Override
	public int deepest() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ShapeShifter flat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> values() {
		// TODO Auto-generated method stub
		return null;
	}

}
