package ar.edu.unq.po2.tp11;

import java.util.ArrayList;
import java.util.List;

public class Simple extends ShapeShifter {
	
	private int valor;
	
	public Simple(int valor) {
		this.valor=valor;
	}
	
	public int getValor() {
		return this.valor;
	}

	@Override
	public IShapeShifter compose(IShapeShifter shapeShifter) {
		List<IShapeShifter> shapeShifters = new ArrayList<IShapeShifter>();
		shapeShifters.add(this);
		shapeShifters.add(shapeShifter);
		Compuesto compuesto = new Compuesto(shapeShifters);
		return compuesto;
	}

	@Override
	public int deepest() {
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
