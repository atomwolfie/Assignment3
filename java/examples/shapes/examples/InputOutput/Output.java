package examples.InputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import examples.Composite.ShapeComponent;
import examples.Composite.ShapeGroup;

public class Output {
	
	
	public void writeFile(ShapeGroup shapeGroup, String fileName) throws IOException{
			
		for(int i = 0; i < shapeGroup.shapeComponents.size(); i++){
			
			ShapeComponent shape = shapeGroup.getComponent(i);
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
			writer.write(shape.printAllparameters());
			writer.close();
		}
		
	}
	
	
	
	
	
	public void writeFileTest(OutputStream generalOutput) throws IOException{
				
		OutputStream outPut = generalOutput;

		 byte b[] = {65, 66, 67, 68, 69, 70}; 
         
	        //illustrating write(byte[] b) method 
		 outPut.write(b); 
	          
	        //illustrating flush() method 
		 outPut.flush(); 
	  
	        //illustrating write(int b) method 
	        for (int i = 71; i <75 ; i++)  
	        { 
	        	outPut.write(i); 
	        } 
	          
	        outPut.flush(); 
	          
	        //close the stream 
	        outPut.close(); 
	}
}
