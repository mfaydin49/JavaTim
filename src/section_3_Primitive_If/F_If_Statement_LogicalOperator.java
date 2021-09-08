package section_3_Primitive_If;

public class F_If_Statement_LogicalOperator {
    public static void main(String[] args) {
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("it is not an alien!");
        }

        int topScore = 100;
        if (topScore != 100) {
            System.out.println("you don't done");
        }
        int secondTopScore = 81; // "&" is bitwise operator
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("well done");
        }
        if ((topScore > 90) || (secondTopScore <= 90)) { // "|" is bitwise operator
            System.out.println("Either or both of the conditions are true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("this is not supposed to happen");
        } else if (!isCar) {
            System.out.println("this is not car");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        // Challenge
        double firstNumber = 20.00d;
        double secondNumber = 80.00d;
        double totalValue = (firstNumber + secondNumber) * 100.00d;
        System.out.println("Total Value: " + totalValue);
        double theRemainder = totalValue % 40.00d;
        System.out.println("The Remainder: " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder: " + isNoRemainder);
        if (!isNoRemainder){
            System.out.println("got some remainder");
        }
    }
}
