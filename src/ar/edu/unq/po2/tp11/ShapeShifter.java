package ar.edu.unq.po2.tp11;

import java.util.List;

public abstract class ShapeShifter implements IShapeShifter {
	
	public abstract IShapeShifter compose(IShapeShifter shapeShifter);
	
	public abstract int deepest();
	
	public abstract IShapeShifter flat();
	
	public abstract List<Integer> values();

}
