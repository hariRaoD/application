package application.com.app.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 * @author Dannamaneni
 *
 */
public class AppTest 
{

	
    @Test
    public void longestStringLengthSuccessTest() {
    	String result = App.longestString("The cow jumped over the moon.");
    	String[] resultArray = result.split(" ");
    	assertEquals(6, Integer.parseInt(resultArray[0]));
    	assertEquals("jumped", resultArray[1]);
    }
    
   
}
