import java.util.Scanner;

class average_function {

    static void average(int a, int b, int c) {
        double avg = (a + b + c) / 3.0;
        System.out.println("Average = " + avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        average(a, b, c);
    }
}