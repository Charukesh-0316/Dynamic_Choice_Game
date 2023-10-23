package com.charukesh.java_collections;

import java.util.LinkedList;
import java.util.Scanner;

public class Linked_List {
	
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to Choice Game: ");
		System.out.println("Please Choose Option: ");
		System.out.println("1. Add your name");
        System.out.println("2. Remove name");
        System.out.println("3. Display all names");
        System.out.println("4. Exit");
        
		
		while(true){
			System.out.print("Enter your choice: ");
            
            int userInput = scanner.nextInt();
            scanner.nextLine();
            
            if(userInput == 1) {
            	System.out.println("Enter your nice name : ");
            	String userName = scanner.nextLine();
            	list.add(userName);
            	System.out.println("User Added Successfully");
            }else if(userInput == 2) {
            	System.out.println("Enter name to remove from list: ");
            	String userName = scanner.nextLine();
            	Boolean UserFound = false;
            	for(int i=0;i<list.size();i++) {
            		if(userName.equals(list.get(i))) {
            			list.remove(userName);
            			System.out.println("User Removed Successfully");
            			UserFound = true;
            		}
            	}
            	if(UserFound == false) {
            		System.out.println("User Not Found");
            	}
             	
            }else if(userInput == 3) {
            	System.out.println(list);
            	
            }else if(userInput == 4) {
            	System.out.println("Game stopped");
            	scanner.close();
            	System.exit(userInput);
            	break;
            }else {
				System.out.println("Please Enter Valid Choice");
			}
            
		}
		
	}

}
