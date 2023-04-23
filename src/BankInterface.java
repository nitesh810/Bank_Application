public interface BankInterface {

    double checkMoney();
    String addMoney(int amount);
    String withdrawMoney(int amount , String password);
    double calculateInterest(int year);
}
