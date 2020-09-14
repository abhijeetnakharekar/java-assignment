package pack;

public class PojoClass 
{
	 public String getAdvice(String qualification)
	{
		 String s1 = "dac";
		 String s2 = "not eligible";
		if(qualification.equalsIgnoreCase("be"))
		{
			
			return s1;
		}
		else
			return s2;
		
			
	}

}
