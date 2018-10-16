package examples.Testing.FactoryTesting;

import static org.junit.Assert.*;



import org.junit.Test;

import Factory.ShapeFactory;
import examples.shapes.Circle;
import examples.shapes.Ellipse;
import examples.shapes.Rectangle;
import examples.shapes.ShapeException;
import examples.shapes.Square;
import examples.shapes.Triangle;

public class ShapeFactoryTest {

	@SuppressWarnings("null")
	@Test
    public void testCreateCircle() throws ShapeException   {
        
		Circle circle = new Circle(0,0,5);
		 
		String input = "Circle";
		int circleArray[] = null;
		circleArray[0] = 0;
		circleArray[1] = 0;
		circleArray[2] = 5;
		ShapeFactory factory = new ShapeFactory();	
		assertSame(circle, factory.makeShape(input, circleArray)); 
    }

	
	
	
	@SuppressWarnings("null")
	@Test
    public void testCreateEllipse() throws ShapeException   {
        
		Ellipse ellipse = new Ellipse(0,0,5, 10);
		 
		String input = "Ellipse";
		int ellipseArray[] = null;
		ellipseArray[0] = 0;
		ellipseArray[1] = 0;
		ellipseArray[2] = 5;
		ellipseArray[3] = 10;
		ShapeFactory factory = new ShapeFactory();	
		assertSame(ellipse, factory.makeShape(input, ellipseArray)); 
    }
	
	
	@SuppressWarnings("null")
	@Test
    public void testCreateSquare() throws ShapeException   {
        
		Square square = new Square(0,0,5);
		 
		String input = "Square";
		int squareArray[] = null;
		squareArray[0] = 0;
		squareArray[1] = 0;
		squareArray[2] = 5;
		ShapeFactory factory = new ShapeFactory();	
		assertSame(square, factory.makeShape(input, squareArray)); 
    }
	
	
	@SuppressWarnings("null")
	@Test
    public void testCreateRectangle() throws ShapeException   {
        
		Rectangle rectangle = new Rectangle(0,0,5, 10);
		 
		String input = "Rectangle";
		int recArray[] = null;
		recArray[0] = 0;
		recArray[1] = 0;
		recArray[2] = 5;
		recArray[3] = 10;
		ShapeFactory factory = new ShapeFactory();	
		assertSame(rectangle, factory.makeShape(input, recArray)); 
    }
	
	@SuppressWarnings("null")
	@Test
    public void testCreateTriangle() throws ShapeException   {
        
		Triangle triangle = new Triangle(0,0,10,10,5,5,10,5);
		 
		String input = "Rectangle";
		int triArray[] = null;
		triArray[0] = 0;
		triArray[1] = 0;
		triArray[2] = 10;
		triArray[3] = 10;
		triArray[4] = 5;
		triArray[5] = 5;
		triArray[6] = 10;
		triArray[7] = 5;
		ShapeFactory factory = new ShapeFactory();	
		assertSame(triangle, factory.makeShape(input, triArray)); 
    }
	
	
	
	
}
