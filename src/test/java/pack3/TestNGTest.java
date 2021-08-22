package pack3;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestNGTest {
	
	@Parameters({"Url"})
	@Test
	public void testing1(String Url)
	{
		System.out.println("teting method"+ Url);
	}

}
