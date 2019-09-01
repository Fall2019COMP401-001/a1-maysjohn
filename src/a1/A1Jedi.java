package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here. 
		// Number of people that buy groceries
		
		int num_food = scan.nextInt(); // Number of people that buy groceries
		
		String[] food_name = new String[num_food]; // Input string from  store value
		
		int[]  num_of_food = new int[num_food];
		
		double [] cost_food = new double[num_food]; // Array for Cost of Food
		
		for (int m = 0; m < num_food; m++) { // For loop to store cost and name of food
		
			food_name[m] = scan.next( ); // Storing Food
			
			cost_food[m] = scan.nextDouble( ); // Storing Name
			
		} 
		
		//int customer = 0;
		
		int num_customer = scan.nextInt( ); // Finds number of customer, next Interger
		
		String[] first_name = new String[num_customer]; // Initializes array to store first name
		
		String [] last_name = new String[num_customer]; // Initializes array to store last name
		
		int [] num_customer_bought_item = new int[num_food]; 
			
		//int[] total_amount_food_bought = new int[num_food];
		
		for (int j =0; j < num_customer; j++) { // For Loop to find First and Last name
			
			first_name[j] = scan.next(); // First Name
			
			last_name [j] = scan.next(); // Last Name
			
			int num_groceries = scan.nextInt(); // 
			
			for (int s = 0; s < num_groceries; s++) { // For loop, to find number of Items
				
				int customer = 1; // Place holder variable for one customer
				
				int num_item = scan.nextInt(); // Number of different groceries bought by customer
				
				String food_item = scan.next(); // Place holder for Name of Food bought
				
				for (int mjs = 0; mjs < num_food; mjs++) { //For loop to compare item and cost with item found previously
					
					if(food_item.equals(food_name[mjs])) { // If statement. Compares Item with previously establish array
						
						num_of_food[mjs] = num_of_food[mjs] + num_item; // Amount of time a certain food was bought equation
						
						num_customer_bought_item[mjs] = num_customer_bought_item[mjs] + customer; // Amount of customer bought an item equation
				
					}
					
				}
				
			}
		
		}
		
		for (int m = 0; m < num_food; m++) {  // For loop to print out customer bought items
			
			if (num_of_food[m] == 0 ) { // If statement. Item equal zero. Print out not customer bought
				
				System.out.println("No customers bought " + food_name[m]); // Output no customer bought
				
			}
			else { // Else statement. If no item equal zero then the rest have a value
		System.out.println(num_customer_bought_item[m] + " customers bought " + num_of_food[m] + " " + food_name[m]); // Output customer bought
		
			}
		}
		scan.close(); //Closes Scan
	}
		}
		