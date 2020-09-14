package mvpack1;

public class Loginbean 
{
	public boolean validate(String name,String password)
	{
		if(name.equals("abhi")&& password.equals("dance"))
		{
			return true;
		}
		else
			return false;
	}
	
}
