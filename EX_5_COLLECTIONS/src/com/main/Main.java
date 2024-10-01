package com.main;

import com.reshmaboutique.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
       
        int ch;
        String id;
        Boutique b;
        Scanner scan = new Scanner(System.in);
        Login l = new Login();
        User u = new User();
        int v;
        System.out.println("WELCOME TO MY BOUTIQUE");
        do {
        	
            System.out.println("Enter your name:");
            u.setName(scan.next());
            System.out.println("Enter your password:");
            u.setPassword(scan.next());
            System.out.println("Enter your role (Admin or User):");
            u.setUser_type(scan.next());

            if (l.valid(u.getName(), u.getPassword(), u.getUser_type())) {
                do {
                    System.out.println("1. Add 2. Update 3. Search 4. Remove 5. Show 6. Sort by Dress Cost 7. Exit");
                    ch = scan.nextInt();
                    switch (ch) {
                        case 1:
                        	 b = new Boutique();
                           /*Collections
                            b = new Boutique();
                            System.out.println("Enter id, name, dress type, dress size, and dress cost:");
                            b.setId(scan.next());
                            b.setName(scan.next());
                            b.setDress_type(scan.next());
                            b.setDress_size(scan.next());
                            b.setDress_cost(scan.nextInt());
                            inv.add(b);*/
                        	System.out.println("Enter id, name, dress type, dress size, and dress cost:");
                        	b.setId(scan.next());
                            b.setName(scan.next());
                            b.setDress_type(scan.next());
                            b.setDress_size(scan.next());
                            b.setDress_cost(scan.nextInt());
                            inv.add(b);
                           
                            break;
                        case 2:
                 	b = new Boutique();
//                            System.out.println("Enter id to update:");
//                            id = scan.next();
//                            b = inv.search(id);
//                            if (b != null) {
//                                System.out.println("Enter new details dress cost:");
////                                b.setName(scan.next());
////                                b.setDress_type(scan.next());
////                                b.setDress_size(scan.next());
//                                b.setDress_cost(scan.nextInt());
//                                inv.update(b);
//                            } else {
//                                System.out.println("Boutique not found.");
//                            }
                        	System.out.println("Enter Id to update:");
                        	String idToUpdate=scan.next();
                        	b.setId(idToUpdate);
                        	System.out.println("Enter details to be updated:");
                        	 b.setDress_cost(scan.nextInt());
                        	 inv.update(b);
                            break;
                        case 3:
                            System.out.println("Enter id to search:");
                            id = scan.next();
                            b = inv.search(id);
                            if (b != null) {
                                System.out.println(b);
                            } else {
                                System.out.println("Boutique not found.");
                            }
                            break;
                        case 4:
                            System.out.println("Enter id to remove:");
                            id = scan.next();
                            inv.remove(id);
                            break;
                        case 5:
                            inv.show();
                            break;
                        case 6:
                            inv.sortByDressCost();
                            break;
                        case 7:
                            System.out.println("Exiting...");
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }
                } while (ch != 7);
            } else {
                System.out.println("Invalid credentials.");
            }

            System.out.println("Press 1 to continue or any other key to exit.");
            v = scan.nextInt();
        } while (v == 1);

        scan.close();
    }
}
