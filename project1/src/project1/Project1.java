// Justin Homme Project 1 
package project1;

import java.util.Scanner; //Allows to use scanner

public class Project1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many days do you need caffiene? ");
		int numOfDays = input.nextInt();
		
		System.out.println("What percentage of the days do you want soda? ");
		float percent = input.nextInt();
		
		int sodaDays = Math.round((percent/100) * numOfDays); //finds how many days are soda and rounds the number to an int
		
		int coffeeDays = numOfDays - sodaDays; //calculates how many days are coffee
		
		System.out.println("You plan on drinking " + coffeeDays + " cups of coffee and " + sodaDays + " cans of soda. " );
		
		double packsOfSoda = Math.ceil(sodaDays/12.0); //Math.ceil rounds up to make sure you have enough 12-packs
		int sodaPacks = (int) packsOfSoda; //Typecasting to make an int out of the double
		double totalCost = (coffeeDays * 3.99) + (sodaPacks * 7.99); //Calculates the cost of coffee and 12-packs of soda
		
		System.out.println("This requires buying " + sodaPacks + " 12-packs of soda.");
		
		System.out.println("This will have a total cost of $" + totalCost);
		
		input.close();
	}

}
