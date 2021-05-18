package lotteryGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Game extends Lottery {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Your happy LOTTERY TICKET Game!");
        System.out.println("---- by Michael Romanyshyn ----");
        System.out.println();

        System.out.println("Lets play!");
        System.out.println("press Enter to continue...");

        Scanner key = new Scanner(System.in);
        String input = key.nextLine();

        System.out.println("Enter ten numbers from 1 to 100");
        System.out.println();

        Player.inputTicket();

        System.out.println("Your LOTTERY TICKET:");
        Player.printTicket();
        System.out.println();

        System.out.println("Press Enter to START THE LOTTERY...");
        System.out.println();

        input = key.nextLine();

        System.out.println("Good Luck! The LOTTERY began...");
        System.out.println();

        Thread.sleep(1000);

        ArrayList<Integer> lotteryList = new ArrayList<>(100);
        for (int i = 1; i <= 100; i++) {
            lotteryList.add(i);
        }
        Collections.shuffle(lotteryList);

        startLottery(lotteryList);
        System.out.println();

        System.out.println("The winning combination is: ");
        printWinningCombination(lotteryList);
        System.out.println();
        System.out.println();

        System.out.println("Wait a second.");
        System.out.println("Calculating the results of the happy LOTTERY TICKET Game ...");
        System.out.println();
        Thread.sleep(2000);

        getWinner(lotteryList, Player.playerNumbers);
        System.out.println();

        System.out.println("Thank you for playing happy LOTTERY TICKET Game!");
        System.out.println("Hope you enjoy!");
    }
}
