import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        String grade = (marks >= 90) ? "A"
                : (marks >= 80) ? "B" : (marks >= 70) ? "C" : (marks >= 60) ? "D" : (marks >= 50) ? "E" : "F";

        System.out.println("Grade: " + grade);
        sc.close();

    }

}