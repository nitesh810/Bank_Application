import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name, Password & Balance to create an Account");

        // Create User...
        String name = sc.nextLine();
        String password = sc.next();
        double balance = sc.nextDouble();
        SBIUser user = new SBIUser(name, password, balance);

        // add money..
        System.out.println("Amount you want to add ?");
        String message  = user.addMoney(sc.nextInt());
        System.out.println(message);

        // Withdraw Money...
        System.out.println("Enter Amount You Want To Withdraw");
        int money = sc.nextInt();
        System.out.println("Enter Your Password");
        String pass = sc.next();
        System.out.println(user.withdrawMoney(money, pass));

        // rateOfInterest...
        System.out.println("The rate of interest after 10 year's is...");
        System.out.println(user.calculateInterest(10));

    }
}