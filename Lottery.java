package lotteryGame;

import java.util.ArrayList;

public class Lottery {

    public static void startLottery(ArrayList<Integer> array) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println(array.get(i));
        }
    }

    public static void printWinningCombination(ArrayList<Integer> arrayList) {
        for (int i = 0; i < 10; i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }

    public static void getWinner(ArrayList<Integer> lotteryList, ArrayList<Integer> playerList) {

        int count = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (lotteryList.get(i) == playerList.get(j)) {
                    count = count + 1;
                }
            }
        }

            if (count == 1) {
                System.out.println("Not bad! You got " + count +" match!");
            } else if ((count > 1) && (count <= 5)) {
                System.out.println("Congratulations! You got " + count +" matches!");
            } else if ((count > 5) && (count <= 9)) {
                System.out.println("WOW! You got " + count +" matches!!!");
            } else if (count == 10) {
                System.out.println("INCREDIBLE!!! You got " + count + " matches!!!!!");
            } else {
                System.out.println("There are no matches :(");
                System.out.println("Better luck next time!");
            }
    }
}
