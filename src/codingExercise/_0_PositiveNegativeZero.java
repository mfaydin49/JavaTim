package codingExercise;

public class _0_PositiveNegativeZero {
    public static void checkNumber(int number){
        if (number<0){
            System.out.println("this number is negative");
        }else if (number>0){
            System.out.println("this number is positive");
        }else{
            System.out.println("this number is zero");
        }
    }

    public static void main(String[] args) {
        checkNumber(-1);
    }
}
