package InputOutput;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Output {

	
	public void writeFile(OutputStream generalOutput) throws IOException{
				
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
