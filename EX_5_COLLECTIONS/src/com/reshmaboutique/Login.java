package com.reshmaboutique;

public class Login
{
	public boolean valid(String name,String password,String user_type)
	{
		if(user_type.equalsIgnoreCase("admin"))
			{
			return true;
			}
		else 
		{
			return false;
		}
	}

}
