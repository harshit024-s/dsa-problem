import java.util.Scanner;

public class formula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("Enter two positive integers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        int lhs = (a + b) * (a + b) * (a + b);

        int rhs = (a * a * a) + (b * b * b)
                + (3 * a * a * b) + (3 * a * b * b);

        System.out.println("LHS = " + lhs);
        System.out.println("RHS = " + rhs);

        if (lhs == rhs) {
            System.out.println("VERIFIED");
        } else {
            System.out.println("NOT VERIFIED");
        }

        sc.close();
    }
}