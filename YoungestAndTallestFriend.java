import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for ages
        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();

        // Taking user input for heights
        System.out.print("Enter Amar's height (in cm): ");
        int heightAmar = sc.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int heightAkbar = sc.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int heightAnthony = sc.nextInt();

        // Finding the youngest friend
        int minAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngest = (minAge == ageAmar) ? "Amar" :
                          (minAge == ageAkbar) ? "Akbar" : "Anthony";

        // Finding the tallest friend
        int maxHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallest = (maxHeight == heightAmar) ? "Amar" :
                         (maxHeight == heightAkbar) ? "Akbar" : "Anthony";

        // Displaying results
        System.out.println("\nThe youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        sc.close(); 
    }
}
