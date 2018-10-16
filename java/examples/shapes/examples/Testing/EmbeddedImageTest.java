package examples.Testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import examples.shapes.EmbeddedImage;

public class EmbeddedImageTest {

	@Test
	public void testShowImage()  {
	
	EmbeddedImage bitImage = new EmbeddedImage();
	
	String userInput = "bitmap-image-icon.bmp";
	
	bitImage.showImage(userInput);
	
	}

	
}
