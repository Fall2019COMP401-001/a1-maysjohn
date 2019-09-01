package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here. 
		// Number of people that buy groceries
		
		int num_food = scan.nextInt(); // Number of people that buy groceries
		
		String[] food_name = new String[num_food]; // Input string from  store value
		
		double [] cost_food = new double[num_food]; // Array for Cost of Food
		
		
		for (int m = 0; m < num_food; m++) { // For loop to store cost and name of food
		
			food_name[m] = scan.next( ); // Storing Food
			
			cost_food[m] = scan.nextDouble( ); // Storing Name
			
		} 
		
			int num_customer = scan.nextInt( ); // Finds number of customer, next Interger
			
			String[] first_name = new String[num_customer]; // Initializes array to store first name
			
			String [] last_name = new String[num_customer]; // Initializes array to store last name
			
			double[] total_amount =  new double[num_customer];
			
			for (int j =0; j < num_customer; j++) { // For Loop to find First and Last name
				
				first_name[j] = scan.next(); // First Name
				
				last_name[j] = scan.next(); // Last Name
				
				int num_groceries = scan.nextInt();
				
				for (int s = 0; s < num_groceries; s++) { // For loop, to find number of Items
					
					int num_item = scan.nextInt( ); // Number of Items bought by customer
					
					String food_item = scan.next( );
					
				    for (int mjs = 0; mjs < num_food; mjs++) { // For loop to compare item and cost with item found previously
						
						if (food_item.equals(food_name[mjs])) { // If statement. Compares Item with previously establish array
							
							total_amount[j] += (num_item * cost_food[mjs]);	// Amount equation. Add current with number of item times the cost
							
						}
						
						
					}
				    
				    
				}
			}
			//for (int i=0; i<num_food; i++) {
			//	System.out.println(total_amount[i]);
			//}
			
			double max = findValueMax(total_amount);
			
			double min = findValueMin(total_amount);
			
			double avg = (findValueAvg (total_amount))/ num_customer;
			
			for ( int s = 0; s < num_customer; s++) {
				if (total_amount[s] == max) {
					
				System.out.println("Biggest: " + first_name[s] + " " + last_name[s] + " (" + String.format("%.2f",max) + ")");
				
				}
					
			}
			
			for ( int m = 0; m < num_customer; m++) {
				
				if (total_amount[m] == min) {
					
				System.out.println("Smallest: " + first_name[m] + " " + last_name[m] + " (" + String.format("%.2f",min) + ")");
				
				}
			}
			
			System.out.println("Average: " + String.format("%.2f", avg));
			
			scan.close();
			}
		
			
	static double findValueMax(double[] vals) {
		
		double current_max = vals[0]; 
		
		for ( int m=1; m < vals.length; m++ ) {
			
			if (vals[m] > current_max) {
				
				current_max = vals[m];
				
			}
			
		}
		
		return current_max;
	}
	
	static double findValueMin(double[] vals) {
		
		double current_min = vals[0];
		
		for (int m = 1; m < vals.length; m++ ) {
			
			if ( vals[m] < current_min ) {
				
				current_min = vals[m];
				
			}
			
		}
		
		return current_min;
		
	}
	
	static double findValueAvg(double[] vals) {
		
		double sum = vals[0];
		
	    for ( int s = 1; s < vals.length; s++) {
	    	
			sum = sum + vals[s];
			
			} 
	    
	    return sum; 
	    
	}
	
	}