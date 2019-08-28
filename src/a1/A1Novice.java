package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		// Your code follows here.
		
		int count = scan.nextInt(); // Number of people that buy groceries
		
		//String name[] = new String[count]; // Input string from  store values
		 
		
		for (int m=0; m < count; m++) {  // For loop to run each customer order
			
			char firstName = scan.next().charAt(0); // Finds first initial in first name 
			
			String lastName = scan.next(); // Set variable to last name
			
			int Groceries = scan.nextInt(); // Find the number of groceries bought
			
			double total_price = 0.00; // Amount each customer spent
			
			String countGroceries[ ] = new String[Groceries]; //Input string from stored Groceries
			
			for (int s = 0; s < Groceries; s++) { // For loop to process item and good 
				
				int total_items = scan.nextInt(); // Amount of Each Item
				
				countGroceries[s]= scan.next(); // Name of Grocery 
				
				double item_cost = scan.nextDouble(); //Cost of Each Item
				
				total_price = total_price + (total_items * item_cost);	// Total price of order
				
				
			}
			System.out.println(firstName +". " + lastName + ": " + String.format("%.2f",total_price)); // Output
		   }
		
	
		scan.close();
		}
}
