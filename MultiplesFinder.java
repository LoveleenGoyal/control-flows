import java.util.Scanner;

public class MultiplesFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        // Checking if the input is valid
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");

            // Looping backward from 100 to 1
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) { 
                    System.out.print(i + " ");
                }
            }
        }
        sc.close(); 
    }
}
