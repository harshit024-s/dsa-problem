import java.util.Scanner;

public class incre_decre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = a;
        int c = ++a;
        int d = a++;
        d++;
        System.out.println(d);
        ++c;
        System.out.println(c);
        d--;
        System.out.println(d);
        --d;
        System.out.println(d);
        --b;
        System.out.println(b);
        b--;
        System.out.println(b);
        ++b;
        System.out.println(b);
        System.out.println(a);

        sc.close();

    }

}