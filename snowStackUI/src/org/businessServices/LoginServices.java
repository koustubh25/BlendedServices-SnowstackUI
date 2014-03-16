package org.businessServices;

public class LoginServices {
	
	public boolean authenticate (String username, String password)
	{
		
		if((username.equals("koustubh") && password.equals("koustubh"))|| (username.equals("zeeshan") && password.equals("zeeshan"))||(username.equals("iori") && password.equals("iori"))||(username.equals("shehnaz") && password.equals("shehnaz")))
		{
			
			return true;
		}
			else
			return false;
		
	}

}
