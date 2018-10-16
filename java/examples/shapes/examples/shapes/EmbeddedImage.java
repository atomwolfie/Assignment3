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

	
	private int dimensionX,dimensionY, locationX, locationY;
	private String fileName;

	
	
	public EmbeddedImage(){
		setX(1000);
		setY(750);	
		setLocationX(0);
		setLocationY(0);
	}
	
	
	public EmbeddedImage(String newFile){
		fileName = newFile;
		setX(1000);
		setY(750);	
		setLocationX(0);
		setLocationY(0);
	}
	
	public EmbeddedImage(int x, int y, int xLocation, int yLocation){
		setX(x);
		setY(y);
		setLocationX(xLocation);
		setLocationY(yLocation);	
	}
	
	
	public EmbeddedImage(String newFile,int x, int y, int xLocation, int yLocation){
		fileName = newFile;
		setX(x);
		setY(y);
		setLocationX(xLocation);
		setLocationY(yLocation);	
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
	
	public int getLocationX(){
		return locationX;
	}
	
	public int getLoationY(){
		return locationY;
	}
	
	public void setLocationX(int x){
		locationX = x;
	}
	
	public void setLocationY(int y){
		locationY = y;
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
	
}
