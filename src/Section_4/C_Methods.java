package Section_4;

public class C_Methods {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("your final score " + highScore);

        score = 1000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("your final score " + highScore);

        int highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("fatih ", highScorePosition);

        highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("büşra ", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("rümeysa ", highScorePosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String players, int highScorePosition) {
        System.out.println(players + " managed to get into positions " + highScorePosition + " on the high score table ");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;

        /*if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;*/
    }
}
