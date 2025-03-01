import java.util.Scanner;

public class LargestNumberCheck {
	public static void main(String[] args) {
		// Create Scanner object for user input
        Scanner sc = new Scanner(System.in);
		
		// Taking user input for three numbers
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();
		
		// Check if first, second, or third number is largest of the three
		boolean isFirstLargest = (number1 > number2) &&(number1 > number3);
		boolean isSecondLargest = (number2 > number1) &&(number2 > number3);
		boolean isThirdLargest = (number3 > number1) &&(number3 > number2);
		
		// Display the results
		System.out.println("Is the first number the largest? " + isFirstLargest);
		System.out.println("Is the second number the largest? " + isSecondLargest);
		System.out.println("Is the third number the largest? " + isThirdLargest);
		
		// Close Scanner
		sc.close();
	}
}