import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();
		
		// Checking if year is valid for the Gregorian calendar
        if (year < 1582) {
            System.out.println("Invalid input! The year must be 1582 or later.");
        } else {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
		}
		sc.close();
	}
}
