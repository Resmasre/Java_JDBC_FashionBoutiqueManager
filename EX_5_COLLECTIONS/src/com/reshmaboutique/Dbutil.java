package com.reshmaboutique;

import java.sql.Connection;
import java.sql.DriverManager;

	public class Dbutil 
	{

	    public Connection getDBConnection()

	    {
	        Connection con=null;
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/boutique","root","");
	            }
	    catch(Exception ex)

	        {

	            System.out.println(ex);

	        }

	        return con;

	    }



	}


