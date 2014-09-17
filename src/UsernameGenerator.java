/**
 * Specification:
 * Write an application that prompts for and reads the user's first name and last name (seperately). Then print a 
 * string composed of the first letter of the user's first name, followed by the first five letters of the user's last name,
 * followed by a random number in the range of 10 to 99. Assume that the last name is at least five letters long. Similar 
 * algorithms are sometimes used to generate usernames for new computer accounts.
 * @author MerfZeroOne
 *
 */

import java.util.Random;
import java.util.Scanner;

public class UsernameGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Declare variables
		 */
		String firstName, lastName, lastFive, userName;
		int numberGen;
		char firstLetter;
		/**
		 * create scanner and random generator
		 */
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();

		/**
		 * request, store and format first and last names
		 */
		System.out.println("Enter the first name of employee: ");

		firstName = scan.nextLine();
		firstLetter = firstName.charAt(0);

		System.out.println("Enter the first name of employee: ");

		lastName = scan.nextLine();
		lastFive = lastName.substring(0, 4);

		/**
		 * generate random employee number
		 */
		numberGen = generator.nextInt(90) + 10;

		/**
		 * concat of the char(toString) and other strings
		 */
		userName = Character.toString(firstLetter) + lastFive + numberGen;

		/**
		 * system output of employee number
		 */
		System.out.println("New Generated Username is: " + userName);

		scan.close();
		System.exit(0);

	}

}
