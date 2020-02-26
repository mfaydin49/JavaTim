package Section_5_ControlFlowStatements;

public class D_ParsigValuesFromString {
    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("number as String= " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number= " + number);

        numberAsString += 1;
        number += 1;
        System.out.println("numberAsString= " + numberAsString);
        System.out.println("number= " + number);
    }
}
