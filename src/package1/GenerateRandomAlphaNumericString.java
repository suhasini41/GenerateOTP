package package1;

import com.mifmif.common.regex.Generex;

public class GenerateRandomAlphaNumericString {

	public static void main(String[] args) 
	{
		// Using dependency Generex
		
		// we can also use Xeger dependency
		
		//To generate random string without any particular pattern by just specifying the 
		//length of the string, we can java's RandomStringUtils.random() method.
		
		Generex g = new Generex("[A-Z][0-9]{2}[A-Z]{2}");
		String randomString = g.random();
		System.out.println(randomString);
		
	}

}
