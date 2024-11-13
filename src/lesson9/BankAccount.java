package lesson9;

public class BankAccount {
    static int totalAccounts=0;
    String name;
    String surname;

    public BankAccount(String name, String surname) {
        this.name = name;
        this.surname = surname;
        totalAccounts++;
    }

   public int getTotalAccounts() {
        return totalAccounts;
   }
}
