package examples.Factory;

import examples.Composite.ShapeComponent;
import examples.Composite.ShapeGroup;
import examples.shapes.Circle;
import examples.shapes.Ellipse;
import examples.shapes.Rectangle;
import examples.shapes.ShapeException;
import examples.shapes.Square;
import examples.shapes.Triangle;

public class ShapeFactory {

	
	public ShapeComponent makeShape(String shapeType, int shapeInputs[]) throws ShapeException{
				
		if(shapeType.equals("Circle")){
			return new Circle(shapeInputs[0],shapeInputs[1],shapeInputs[2]); 
		}
				
		if(shapeType.equals("Ellipse")){
			return new Ellipse(shapeInputs[0],shapeInputs[1],shapeInputs[2], shapeInputs[3]); 
		}
		
		if(shapeType.equals("Square")){
			return new Square(shapeInputs[0],shapeInputs[1],shapeInputs[2]); 
		}
		if(shapeType.equals("Rectangele")){
			return new Rectangle(shapeInputs[0],shapeInputs[1],shapeInputs[2], shapeInputs[3]); 
		}
		if(shapeType.equals("Triangle")){	
			return new Triangle(shapeInputs[0],shapeInputs[1],shapeInputs[2], shapeInputs[3], 
					shapeInputs[4], shapeInputs[5], shapeInputs[6], shapeInputs[7]); 
		}
			
		return null;
			
	}
	
	
	
}
