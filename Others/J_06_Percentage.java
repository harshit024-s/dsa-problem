import java.util.Scanner;

public class J_06_Percentage {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Math:");
        int Maths = sc.nextInt();
        System.out.println("Enter marks of English:");
        int English = sc.nextInt();
        System.out.println("Enter marks of Science:");
        int Science = sc.nextInt();
        System.out.println("Enter marks of SSt:");
        int SSt = sc.nextInt();
        System.out.println("Enter marks of Hindi:");
        int Hindi = sc.nextInt();
        System.out.println("Enter marks of Computer:");
        int Computer = sc.nextInt();

        int Total = Maths + English + Science + SSt + Hindi + Computer;
        System.out.println(Total);
        double Percentage = (Total / 600.0) * 100;
        System.out.println(Percentage);

    }
}
