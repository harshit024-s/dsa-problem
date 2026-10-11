import java.util.Scanner;
public class multipleof5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 5; i <= n; i += 5) {
            System.out.println(i);
        }
        sc.close();
    }
}
