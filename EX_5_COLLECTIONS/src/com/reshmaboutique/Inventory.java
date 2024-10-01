package com.reshmaboutique;

import java.util.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
public class Inventory {
	Statement stmt;
	ResultSet rs;
	String qry=null;
	Dbutil db=new Dbutil();
	Connection con;
    List<Boutique> list = new ArrayList<>();
    int count=0;
    public void add(Boutique b) {
        //list.add(b);
    	try
    	{
    		Connection con=db.getDBConnection();
    		stmt=con.createStatement();
    		qry=("insert into products(id,name,dress_type,dress_size,dress_cost) values('"+b.getId()+"','"+b.getName()+"','"+b.getDress_type()+"','"+b.getDress_size()+"','"+b.getDress_cost()+"')");
    		stmt.executeUpdate(qry);
    	}
    	catch(Exception ex)

      	 {

      		 System.out.println(ex.getMessage());

      	 }
    	
    }

    public void show() {
        /*for (Boutique b : list) {
            System.out.println(b);
        }*/
    		try {

       		 Dbutil db =new Dbutil();

       		 con=db.getDBConnection();

       		 stmt=con.createStatement();

       		 rs=stmt.executeQuery("select * from products");

       		 while(rs.next())

       			 System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));

       		 }

       	 catch(Exception ex)

       	 {

       		 System.out.println(ex.getMessage());

       	 }

    	}
    

    public Boutique search(String id) {
        for (Boutique b : list) {
            if (id.equals(b.getId())) {
                return b;
            }
        }
        return null;
    }

    public void update(Boutique b) {
//        System.out.println("Updated successfully");
//        show();
    	try
    	{
    		con=db.getDBConnection();
    		stmt=con.createStatement();
    		count=stmt.executeUpdate("update products set dress_cost='"+b.getDress_cost()+"'where id='"+b.getId()+"'");
    		System.out.println("Updated successfully");
    	}
    	catch(Exception ex)

     	 {

     		 System.out.println(ex.getMessage());

     	 }
    }

    public void remove(String id)
    {
//        Iterator<Boutique> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            Boutique b = iterator.next();
//            if (id.equals(b.getId())) {
//                iterator.remove();
//                break;
//            }
//        }
    	try
    	{
    		con=db.getDBConnection();
    		stmt=con.createStatement();
    		qry="delete from products where id='"+id+"'";
    		count=stmt.executeUpdate(qry);
    		if(count==1)
    			System.out.println("Deleted successfully");
    	}
    	catch(Exception ex)

    	 {

    		 System.out.println(ex.getMessage());

    	 }
    }

    public void sortByDressCost() {
        Collections.sort(list, new csort());
        System.out.println("Sorted by dress cost:");
        show();
    }
}
