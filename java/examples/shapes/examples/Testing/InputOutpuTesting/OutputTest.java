package examples.Testing.InputOutpuTesting;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.junit.Before;
import org.junit.Test;

import InputOutput.Output;

public class OutputTest {

	 @Test
     public void testRead() throws IOException  {
         
		   String stringGivenByUser = "text";
		   OutputStream targetStream = new ByteArrayOutputStream(stringGivenByUser.getBytes());
		  		   
		   Output outputGuy = new Output();
		   outputGuy.writeFile(targetStream);	   
		
     }


}
