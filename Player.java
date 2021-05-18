package lotteryGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    public static ArrayList<Integer> playerNumbers = new ArrayList<>(10);

    public static ArrayList<Integer> inputTicket() {
        for (int i = 0; i < 10; i++) {
            Scanner console = new Scanner(System.in);
            int number = console.nextInt();

            if ((number < 1) || (number > 100)) {
                System.out.println("Oops! Please enter numbers between 1 and 100...");
                i--;
            } else {
                if (playerNumbers.contains(number)) {
                    i--;
                } else {
                    Player.playerNumbers.add(number);
                }
            }
        }

        return Player.playerNumbers;
    }

    public static void printTicket() {
        System.out.println(Player.playerNumbers);
    }
}
