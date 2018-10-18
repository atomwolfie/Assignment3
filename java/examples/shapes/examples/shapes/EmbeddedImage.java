package examples.shapes;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import examples.Composite.ShapeComponent;

public class EmbeddedImage extends ShapeComponent{

	//instrinsic: location(x,y)
	
	//extrinsic stuff:
	private int dimensionX,dimensionY;
	
	private String fileName;
	

	
	
	public EmbeddedImage(){
		setShapeType("Embedded Image");
		setX(1000);
		setY(750);	
		setCenter(0,0);
	}
	
	
	public EmbeddedImage(String newFile){
		setShapeType("Embedded Image");
		fileName = newFile;
		setX(1000);
		setY(750);	
		setCenter(0,0);
	}
	
	
	public EmbeddedImage(Double x, Double y){
		setShapeType("Embedded Image");
		setX(1000);
		setY(750);	
		setCenter(x,y);
	}
	
	public EmbeddedImage(Double x, Double y, String newFile){
		setShapeType("Embedded Image");
		fileName = newFile;
		setX(1000);
		setY(750);	
		setCenter(x,y);
	}
	
	public EmbeddedImage(int xLocation, int yLocation, int x, int y){
		setShapeType("Embedded Image");
		setX(x);
		setY(y);
		setCenter(xLocation,yLocation);	
	}
	
	
	public EmbeddedImage(int xLocation, int yLocation, int x, int y, String newFile){
		setShapeType("Embedded Image");
		fileName = newFile;
		setX(x);
		setY(y);
		setCenter(xLocation,yLocation);	
	}
	
	public void showImage(){
		try {
            JFrame frame = new JFrame();
            File imageFile = new File(fileName);
            Image i = ImageIO.read(imageFile);
            ImageIcon image = new ImageIcon(i);
            JLabel imageLabel = new JLabel(image);
            frame.add(imageLabel);
            frame.setLayout(null);
            imageLabel.setLocation(0, 0);
            imageLabel.setSize(dimensionX, dimensionY);
            imageLabel.setVisible(true);
            frame.setVisible(true);
            //frame.setSize(1000, 750);
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

	public String getFilename(){
		return fileName;
	}
	
	public void setFilename(String newName){
		fileName = newName;
	}
	
	
	public int getX(){
		return dimensionX;
	}
	
	public int getY(){
		return dimensionY;
	}
	
	public void setX(int x){
		 dimensionX = x;
	}
	
	public void setY(int y){
		 dimensionY = y;
	}
	
	
	
	
	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void scale(double scaleFactor) throws ShapeException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(double deltaX, double deltaY) throws ShapeException {
		// TODO Auto-generated method stub
		
	}
	
	 @Override
		public String printAllparameters() {
						
			Point newPoint = getCenter();
			
			return 
			getShapeType() + ""
			+ Double.toString(newPoint.getX()) + " " 
			+ Double.toString(newPoint.getY()) + " " 
			+ Double.toString(dimensionX) + " "
			+ Double.toString(dimensionY)
			+ fileName
			+ "\n";
		}
	
}
