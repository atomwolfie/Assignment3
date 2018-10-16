package examples.Testing.InputOutpuTesting;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import examples.InputOutput.Input;



public class InputTest {

//	   @Test
//       public void testReadStream() throws IOException  {
//           
//		   String stringGivenByUser = "text";
//		    InputStream targetStream = new ByteArrayInputStream(stringGivenByUser.getBytes());
//		  		   
//		   Input inputGuy = new Input();
//		   inputGuy.readFile(targetStream);	   		
//       }

	   
	   @Test
       public void testRead() throws IOException  {
           
		   String stringGivenByUser = "ABC.txt";
		    		  		   
		   Input inputGuy = new Input();
		   inputGuy.readFile(stringGivenByUser);	   		
		   
		   //need asserts
       }

}
