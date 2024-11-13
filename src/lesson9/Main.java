package lesson9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  Create a Car class

        Car car = new Car("BMW", "116");
        System.out.println(car);


        // Concatenate these strings to create a full name and display it to the user
        System.out.println("Enter your name and surname:");
        Scanner sc = new Scanner(System.in);
        Users users = new Users(sc.nextLine(), sc.nextLine());
        System.out.println(users.welcome());


        // BankAccount
        BankAccount bankAccount = new BankAccount("Rasul", "Salimov");
        BankAccount bankAccount1 = new BankAccount("Aytac", "Karimova");
        System.out.println("Total accounts: " + BankAccount.totalAccounts);


        // Circle area
        CircleArea c = new CircleArea(2.2);
        System.out.println(c.AreaOfCircle());


        // Entertainment
        CoinFlip coinFlip=new CoinFlip(0);
        System.out.println(coinFlip.GetResults());
    }
}
