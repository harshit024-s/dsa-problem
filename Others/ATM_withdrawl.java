import java.util.Scanner;

class ATM_Withdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current balance: ");
        int balance = sc.nextInt();

        System.out.print("Enter withdrawal amount: ");
        int withdrawal = sc.nextInt();

        if (withdrawal <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (withdrawal > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - withdrawal;

            System.out.println("Withdrawal Successful");
            System.out.println("Withdrawn Amount: " + withdrawal);
            System.out.println("Remaining Balance: " + balance);
        }

        sc.close();
    }
}
