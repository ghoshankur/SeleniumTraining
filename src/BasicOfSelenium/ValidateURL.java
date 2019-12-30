package BasicOfSelenium;

public class ValidateURL {
	
	public static void validateURL(String passingURL,String rcvURL)
	{	
		if(rcvURL==passingURL)
		{
			System.out.println("Hitting the correct URL");
		}else{
			System.out.println("Site at risk, Hitting different URL");
		}
	}

}
