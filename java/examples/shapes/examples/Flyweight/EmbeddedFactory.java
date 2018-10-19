package examples.Flyweight;

import java.util.HashMap;

import examples.shapes.EmbeddedImage;
import examples.shapes.ShapeException;

public class EmbeddedFactory {
	
	private static final HashMap< Double, EmbeddedImage> imageByLocation
	= new HashMap<Double, EmbeddedImage>();
	
	public static EmbeddedImage getImage(double x, double y, String newFile) throws ShapeException{
		
		double searchKey = x + y;
		
		EmbeddedImage image = (EmbeddedImage)imageByLocation.get(searchKey);
		
		if(image == null){
			image = new EmbeddedImage(x,y, newFile);
			imageByLocation.put(searchKey, image);
		}
		
		return image;
	}
	
	
}
