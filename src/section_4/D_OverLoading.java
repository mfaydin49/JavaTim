package section_4;

public class D_OverLoading {
    public static void main(String[] args) {
        calculateScore("Fatih", 500);
        int newCalculate = calculateScore("Fatih", 500);
        System.out.println("New Calculated Score: " + newCalculate);
        calculateScore(500);
        calculateScore();
        calcFeetAndInchesToCentimeters(15, 0);
        calcFeetAndInchesToCentimeters(157);

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player no scored ");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("Invalid Value");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remaining = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feed and " + remaining + " inches");
        return calcFeetAndInchesToCentimeters(feet, remaining);
    }
}
