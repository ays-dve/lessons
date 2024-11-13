package lesson9;

import java.util.Random;

public class CoinFlip {

    int userChoice;

    public CoinFlip(int userChoice) {
        this.userChoice = userChoice;
    }

    public String GetResults() {
        Random rand = new Random();
        int compChoice = rand.nextInt(0, 2);
        System.out.println(compChoice);

        if (userChoice == compChoice) {
            return "Congrats";
        } else {
            return "Failed";
        }
    }
}
