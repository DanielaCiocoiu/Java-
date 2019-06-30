import java.util.Random;

public class Ex2 {

    public static void main(String[] args) {
        String playerName = null;
        int highScore = Ex2.calculateScore(true, 900, 5, 100);
        System.out.println("Your final score was: " + highScore);

        highScore = Ex2.calculateScore(false, 0, 0, 0);
        System.out.println("Your final score was: " + highScore);

        int position = Ex2.calculateHighScorePosition(1500);
        Ex2.displayHighScorePosition("Tim", position);

        position = Ex2.calculateHighScorePosition(900);
        Ex2.displayHighScorePosition("Bob", position);

        position = Ex2.calculateHighScorePosition(400);
        Ex2.displayHighScorePosition("Percy", position);

        position = Ex2.calculateHighScorePosition(50);
        Ex2.displayHighScorePosition("Gilbert", position);
    }
    public static void phoneNumber() {

        String s = "java2s".replace('a', 'Z').trim().concat("Aa");
        s.substring(0, 2);
        System.out.println("Noul substring este: " + s);

        System.out.println("--------------------------------");

        //Write a program that creates and prints a random phone number of the form XXX-XXX-XXXX.
        //Include the dashes in the output. Do not let the first three digits contain an 8 or 9 ,
        // the second set of three digits is no greater than 742.
        Random rand = new Random();
        int first = rand.nextInt(8);
        int second = rand.nextInt(8);
        int third = rand.nextInt(8);
        int middle = rand.nextInt(742);
        int last = rand.nextInt(9999);
        String middleString;
        String lastString;

        middleString = Integer.toString(middle);
        lastString = Integer.toString(last);

        while (middleString.length() < 3) {
            middleString = "0" + middleString;
        }
        while (lastString.length() < 4) {
            lastString = "0" + lastString;

        }
        System.out.println("Noul numar de telefon generat random este: " + Integer.toString(first) + Integer.toString(second) + Integer.toString(second) + "-" + middle + "-" + last);

        System.out.println("--------------------------------");
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else if (number == 0) {
            System.out.println("zero");
        }
    }



    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position: " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >=500 ) {
            return 2;
        } else if (playerScore >= 100 ) {
            return 3;
        }
        return 4;
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted + bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }
}