
//Develop a java application which will take salary as an input and add bonus 2000
//for salary greater than 10000 and for others add 1000 as bonus. and also try to add some 
//corner cases and exceptions.

package low_Level_Design_practice;

import java.util.*;

public class FirstProblem {

	public static void main(String[] args) {
		boolean t = true;
		while (t) {
			System.out.println(" ____________________________________");
			System.out.println("|   Type 1 to enter Salary            |");
			System.out.println("|   Type 2 to read Thought of the day |");
			System.out.println("|   Type 3 to exit from the app       |");
			System.out.println(" ____________________________________");

			int choice = 0;
			Scanner input = new Scanner(System.in);
			boolean validInput = false;
			while (!validInput) {
				try {

					choice = input.nextInt();
					validInput = true;
				} catch (Exception e) {
					System.out.println("Invalid input! Please enter a valid integer.");
					input.next();
				}
			}

			switch (choice) {
			case 1: {
				System.out.println("Enter the Salary:");
				double s = input.nextDouble();
				if (s >= 10000) {
					s += 2000;

				} else {
					s += 1000;

				}
				System.out.println("Your total Salary is: " + s + "\n");

				break;
			}
			case 2: {
				System.out.println("Your hard work and dedication will pave the way for your success." + "\n");
				break;
			}
			case 3: {
				System.out.println("Thank you");
				t = false;
				break;
			}
			default: {
				System.out.println("Invalid Choice");
			}
			}
		}

	}
}
