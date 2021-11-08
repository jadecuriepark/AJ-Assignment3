// Unit 3 Assignment: Product management system - Jade Park (9-5-2021)

import java.util.Scanner;

public class Assignment3 { // Driver class

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Starr's product manager!");
		System.out.println("Enter the following information for the Starr Spirit hat: ");
		
		System.out.print("color: ");
		String color = input.next();
		System.out.print("price: ");
		double price = input.nextDouble();
		System.out.print("adjustable: ");
		boolean adjustable = input.nextBoolean();
		
		// hat object
		Hat h = new Hat(color, price, adjustable);
		
		
		System.out.println("\nEnter the following information for the Starr Spirit waterbottle: ");
		
		System.out.print("color: ");
		color = input.next();
		System.out.print("price: ");
		price = input.nextDouble();
		System.out.print("size: ");
		char size = input.next().charAt(0);
		
		// bottle object
		Bottle b = new Bottle(color, price, size);
		
		
		System.out.println("\nEnter the following information for the Starr Spirit phone case: ");
		
		System.out.print("color: ");
		color = input.next();
		System.out.print("price: ");
		price = input.nextDouble();
		System.out.print("model: ");
		String model = input.next();
		
		// phone case object
		PhoneCase p = new PhoneCase(color, price, model);
		
		// printing out the product summary to the user
		System.out.println("\nSummary:");
		System.out.println(h.outputProduct());
		System.out.println(b.outputProduct());
		System.out.println(p.outputProduct());
		
	}

}
