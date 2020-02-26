package Section_5_ControlFlowStatements;

public class C_While_DoStatement {
    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("count value is" + count);
            count++;
        }
        for (count = 0; count != 6; count++) {
            System.out.println("count value is" + count);
        }

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("count value is" + count);
            count++;
        }

        count = 6;
        do {
            System.out.println("Count value was " + count);
            count++;
            if (count > 100) {
                break;
            }
        } while (count != 6);

        int number = 4;
        int finishNumber = 20;
        int evenNumberFound = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            evenNumberFound++;
            System.out.println("even number" + number);
        }
        System.out.println("Total even number: " + evenNumberFound);

    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
