import java.util.Scanner;
public class function_greatestoftwo {
    static int greatestOfTwo(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = greatestOfTwo(a, b);
        System.out.println("Greatest of " + a + " and " + b + " is: " + result);
    }
    
}
