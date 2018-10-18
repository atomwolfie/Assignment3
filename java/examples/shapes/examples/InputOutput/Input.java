package examples.InputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import examples.Composite.ShapeGroup;
import examples.Factory.ShapeFactory;
import examples.Flyweight.EmbeddedFactory;
import examples.shapes.ShapeException;

public class Input {

	
	
	
	public void readFileTest(InputStream generalInput) throws IOException{
		
		InputStream input = generalInput;
		
		try { 
			            
            int data = input.read();
            
            while(data != -1){
            	
            	System.out.print((char)input.read()); 
            	
            	 data = input.read();	
            }            
        } 
        catch(Exception excpt) 
        { 
            // in case of I/O error 
            excpt.printStackTrace(); 
        }      
		input.close();
	}
	
	
	
	@SuppressWarnings("resource")
	public ShapeGroup readFile(String fileName) throws IOException, ShapeException{
		
		File file = new File(fileName);		
		Scanner sc = new Scanner(file); 
		char[] myChars = fileName.toCharArray();		
		ShapeGroup shapeGroup = new ShapeGroup("Shape group", "Imported from file");

		//array that will hold inputs eeded for shapes (ie coordinates, radius, etc)
		ArrayList<Double> inputs = new ArrayList<Double>();
		
		if(myChars[myChars.length - 1] == 't'){
			ShapeFactory shapeFactory = new ShapeFactory();
			
			while (sc.hasNextLine()){
			
				//get inputs
				String shapeType = sc.nextLine();
				//double input1 = sc.nextDouble();
				
				String[] tokens = shapeType.split(" ");
				
				for(int i = 1; i < tokens.length; ++i){
					System.out.println(tokens[i]);
					inputs.add(Double.parseDouble(tokens[i]));
				}				
				shapeGroup.add(shapeFactory.makeShape(tokens[0], inputs));
			}
		}
		
		
		//create embadded image
		if(myChars[myChars.length - 1] == 'p'){
			EmbeddedFactory embedFactory = new EmbeddedFactory();			
			shapeGroup.add(embedFactory.getImage(0, 0, fileName));
		}
		
		return shapeGroup;
}
}