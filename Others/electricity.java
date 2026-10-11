import java.util.Scanner;

public class electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total electricity unit consumed");
        int unit = sc.nextInt();

        int rate = 0;

        if (unit <= 100) {
            rate = unit * 5;
        } else if (unit >= 101 && unit <= 200) {
            rate = unit * 7;
        } else if (unit >= 201 && unit <= 300) {
            rate = unit * 10;
        } else if (unit <= 300) {
            rate = unit * 12;
        } else {
            System.out.print("More unit consumed");
        }
        System.out.print("Electricity bill is=" + rate);
        sc.close();

    }
}