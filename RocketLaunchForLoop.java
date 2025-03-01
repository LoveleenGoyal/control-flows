import java.util.Scanner;

public class RocketLaunchForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for countdown starting value
        System.out.print("Enter the countdown starting number: ");
        int counter = sc.nextInt();

        // For loop to countdown from the user input to 1
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        // Printing the final message
        System.out.println("Rocket Launched!");
    }
}
