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
		
		ShapeGroup shapeGroup = new ShapeGroup("Shape group", "Imported from file");
		
		if(shapeType.equals("Circle")){
			shapeGroup.add(new Circle(shapeInputs[0],shapeInputs[1],shapeInputs[2]));
//			return new Circle(shapeInputs[0],shapeInputs[1],shapeInputs[2]); 
		}
				
		if(shapeType.equals("Ellipse")){
			shapeGroup.add(new Ellipse(shapeInputs[0],shapeInputs[1],shapeInputs[2], shapeInputs[3]));
//			return new Ellipse(shapeInputs[0],shapeInputs[1],shapeInputs[2], shapeInputs[3]); 
		}
		
		if(shapeType.equals("Square")){
			shapeGroup.add(new Square(shapeInputs[0],shapeInputs[1],shapeInputs[2]));
//			return new Square(shapeInputs[0],shapeInputs[1],shapeInputs[2]); 
		}
		if(shapeType.equals("Rectangele")){
			shapeGroup.add(new Rectangle(shapeInputs[0],shapeInputs[1],shapeInputs[2], shapeInputs[3]));
//			return new Rectangle(shapeInputs[0],shapeInputs[1],shapeInputs[2], shapeInputs[3]); 
		}
		if(shapeType.equals("Triangle")){
			shapeGroup.add(new Triangle(shapeInputs[0],shapeInputs[1],shapeInputs[2], shapeInputs[3], 
					shapeInputs[4], shapeInputs[5], shapeInputs[6], shapeInputs[7]));		
//			return new Triangle(shapeInputs[0],shapeInputs[1],shapeInputs[2], shapeInputs[3], 
//					shapeInputs[4], shapeInputs[5], shapeInputs[6], shapeInputs[7]); 
		}
		else{
			//it's a bit map image
		}
		
		return shapeGroup;
			
	}
	
	
	
}
