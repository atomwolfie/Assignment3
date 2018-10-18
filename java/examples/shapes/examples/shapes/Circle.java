package examples.shapes;

import examples.Composite.ShapeComponent;
import examples.Internal.AreaCalculator;

/**
 * Circle
 *
 * This class represents circle objects that can be moved and scales.  Users of a circle can also get its area.
 *
 */
public class Circle extends ShapeComponent{
    
	
    private double radius;

    /**
     * Constructor with x-y Location for center
     *
     * @param x                 The x-location of the center of the circle -- must be a valid double
     * @param y                 The y-location of the center of the circle
     * @param radius            The radius of the circle -- must be greater or equal to zero.
     * @throws ShapeException   The exception thrown if the x, y, or z are not valid
     */
    public Circle(double x, double y, double newRadius) throws ShapeException {
    	setShapeType("Circle");
    	Validator.validatePositiveDouble(radius, "Invalid radius");
        setCenter(x, y);       
        radius = newRadius;        
    }

    /**
     * Constructor with a Point for center
     *
     * @param center            The x-location of the center of the circle -- must be a valid point
     * @param radius            The radius of the circle -- must be greater or equal to zero.
     * @throws ShapeException   The exception thrown if the x, y, or z are not valid
     */
    public Circle(Point newCenter, double newRadius) throws ShapeException {
    	setShapeType("Circle");
    	Validator.validatePositiveDouble(radius, "Invalid radius");
        if (newCenter==null)
            throw new ShapeException("Invalid center point");
       
        setCenter(newCenter); 
                   
        radius = newRadius;
    }

 
  

    /**
     * @return  The radius of the circle
     */
    public double getRadius() { return radius; }

  
     
    @Override
    public void move(double deltaX, double deltaY) throws ShapeException {
        this.move(deltaX, deltaY);
    }



	@Override
	public double computeArea() {		
		AreaCalculator areaHelper = new AreaCalculator();	
		 return areaHelper.computeCircleArea(radius);
	}

	@Override
	public void scale(double scaleFactor) throws ShapeException{
		Validator.validatePositiveDouble(scaleFactor, "Invalid scale factor");
        radius *= scaleFactor;
	}

	@Override
	public String printAllparameters() {
					
		Point newPoint = getCenter();
		
		return 
		getShapeType() + "" 
		+ Double.toString(newPoint.getX()) + " " 
		+ Double.toString(newPoint.getY()) + " " 
		+ Double.toString(radius)
		+ "\n";
	}

}