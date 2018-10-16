package examples.InputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

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
	public void readFile(String fileName) throws IOException{
		
		File file = 
			      new File(fileName);
		
		Scanner sc = new Scanner(file); 
		  
	    while (sc.hasNextLine()) 
	      System.out.println(sc.nextLine());
		
	    //parse stuff out and use factory to create shapes and shape composites
   
}
}