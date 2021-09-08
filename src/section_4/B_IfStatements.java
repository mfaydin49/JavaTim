package section_4;

public class B_IfStatements {
    public static void main(String[] args) {
        int score = 5000;

        if (score < 5000 && score > 1000) {
            System.out.println("your score was less 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("your score was less than 1000");
        } else {
            System.out.println("got here");
        }

        calculateScore(true, 10000, 5, 100);
        calculateScore(true, 800, 8, 200);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
            return finalScore;
        }
        return -1;
    }
}
