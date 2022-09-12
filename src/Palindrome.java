/**
 * This class is designed to accept String input, add it to a stack, and then read that stack forwards & backwards to determine if it's a palindrome.
 * @author Adam Winders
 *
 */
import java.util.Stack;
import java.util.Scanner;

public class Palindrome {
	
	
	public static void main (String [] args) {
		
		/*
		 * Creates a new Scanner object called "scan."
		 */
		Scanner scan = new Scanner(System.in);

		/**
		 * Captures user's String with Scanner object, and creates new String object from it called 
		 * "input."
		 * @param any String of user's choice.
		 */
		System.out.print("Enter a String: ");
		String input = scan.nextLine();
		
		
		/*
		 * Creates new Stack called "inputStack" to contain user-entered Strings.
		 */
		Stack inputStack = new Stack();
		
		/*
		 * For loop method that starts at the first index position, iterates through the entire input stack, and increments by 1 each time it loops.
		 * 
		 * Adds String object from user to the stack, one on top of the other.
		 */
		for (int i = 0; i < input.length(); i++) {
			inputStack.push(input.charAt(i));
		}	// end for
		
		/*
		 * Creates String object named "reverse" instantiated with "" argument.
		 */
		String reverse = "";
		
		/*
		 * While the inputStack object is NOT empty(meaning: someone has entered a String argument), the top entry of the stack is removed & returned. The "reverse" object has the c added to the new String - this runs until stack is empty. Once stack is empty, "reverse" object will now contain the reverse char order of user's input as a new String.
		 */
		while (!inputStack.isEmpty()) {
			reverse = reverse+inputStack.pop();
		}	// end while
		
		/**
		 * If else that checks if user's String input was equal backwards and forwards.
		 * @param String characters were equal when reversed.
		 * @return String was a valid palindrome.
		 * 
		 * @param String characters were not equal when reversed.
		 * @return String is not a valid palindrome.
		 */
		if (input.equals(reverse))
			System.out.println("This String is a palindrome.");
		else
			System.out.println("This String is NOT a palindrome.");
		
	}	// end main
	
}	// end class
