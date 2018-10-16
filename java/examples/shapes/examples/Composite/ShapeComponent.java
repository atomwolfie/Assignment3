package examples.Composite;

import examples.shapes.Point;
import examples.shapes.ShapeException;

public abstract class ShapeComponent {

	private Point center = null;
	
	
	public void setCenter(double x, double y) {	
		center.setX(x);
		center.setY(y);
		
	}
	
	public void setCenter(Point newCenter){
		if(newCenter.equals(null)){
			center.setX(0);
			center.setY(0);
		}
		else{
		center.setX(newCenter.getX());
		center.setY(newCenter.getY());
		}
	}
	
	public Point getCenter(){
		return center;
	}
	
	public void add(ShapeComponent newShapeComponent){
		
		throw new UnsupportedOperationException();
	}
	
	
public void remove(ShapeComponent newShapeComponent){
		
		throw new UnsupportedOperationException();
	}

public void removeAll(){
	
	throw new UnsupportedOperationException();
}




public void displayShapeInfo() {
	
	throw new UnsupportedOperationException();
	
}


public abstract double computeArea();




public abstract void scale(double scaleFactor) throws ShapeException;

public abstract void move(double deltaX, double deltaY) throws ShapeException;
	
}
