import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface{

    // Attributes...
    private String name;
    private String accountNo;
    private String password;
    private double balance;
    private static double rateOfInterest;

    public SBIUser(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;

        this.rateOfInterest = 6.5;
        this.accountNo = UUID.randomUUID()+"";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getRateOfInterest() {
        return rateOfInterest;
    }

    public static void setRateOfInterest(double rateOfInterest) {
        SBIUser.rateOfInterest = rateOfInterest;
    }

    @Override
    public double checkMoney() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        this.balance = balance + amount;
        return "Your New Balance is " + balance;
    }

    @Override
    public String withdrawMoney(int amount, String enteredpassword) {
        if(Objects.equals(enteredpassword, password)) {
            if(amount>balance) {
                return "Insufficient Balance";
            }
            else {
                balance = balance - amount;
                return "Withdraw Money Successfull\nRemaning Balance is : " + balance;
            }
        }
        else {
            return "Wrong Password ";
        }
    }

    @Override
    public double calculateInterest(int year) {
        return (balance*year*rateOfInterest)/100;
    }
}
