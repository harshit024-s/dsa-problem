import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = n;
        int counter = 0;
        int temp = n;

        while (temp > 0) {
            counter++;
            temp = temp / 10;
        }
        int sum = 0;
        temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (int)Math.pow(digit, counter);
            temp = temp / 10;
        }

        if (sum == d) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}