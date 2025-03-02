import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Enter marks for Physics: ");
        int physics = sc.nextInt();

        System.out.print("Enter marks for Chemistry: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter marks for Maths: ");
        int maths = sc.nextInt();

        // Calculate total and percentage
        int totalMarks = physics + chemistry + maths;
        double percentage = totalMarks / 3.0;

        // Determine grade and remarks based on the percentage
        String grade, remarks;
        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Display the results
        System.out.println("\n------ Student Report ------");
        System.out.println("Physics: " + physics);
        System.out.println("Chemistry: " + chemistry);
        System.out.println("Maths: " + maths);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        sc.close(); 
    }
}
