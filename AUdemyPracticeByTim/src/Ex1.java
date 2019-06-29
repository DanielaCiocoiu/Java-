public class Ex1 {

    public static void main(String[] ars) {
        // Ex2.phoneNumber();
//--------------------------------------------------

        String playerName = null;
        int highScore = calculateScore(true, 900, 5, 100);
        System.out.println("Your final score was: " + highScore);

        highScore = calculateScore(false, 0, 0, 0);
        System.out.println("Your final score was: " + highScore);

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", position);


        System.out.println("Your final score was: " + highScore);


    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position: " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if ((playerScore > 500) && (playerScore < 1000)) {
            return 2;
        } else if ((playerScore > 100) && (playerScore < 500)) {
            return 3;
        } else {
            return 4;
        }
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





