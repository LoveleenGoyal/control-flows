import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for countdown starting value
        System.out.print("Enter the countdown starting number: ");
        int counter = sc.nextInt();

        // While loop to countdown from the user input to 1
        while (counter >= 1) {
            // Printing the countdown value
            System.out.println(counter);

            // Decrement the counter
            counter--;
        }

        // Printing the final message
        System.out.println("Rocket Launched!");
    }
}
