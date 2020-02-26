package Section_3_Primitive_If;

public class E_Operators_AbbreviatingOperatrs {
    public static void main(String[] args) {
        int result = 3;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("Previous Result = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("Previous Result = " + previousResult);
        result = result * 10;
        System.out.println("2 * 10 = " + result);
        System.out.println("Previous Result = " + previousResult);
        result = result / 5;
        System.out.println("20 / 5 = " + result);
        result = result % 3;
        System.out.println("4 % 3 = " + result);

        result++;
        System.out.println("result++ (1 + 1) = " + result);
        result--;
        System.out.println("result++ (2 - 1) = " + result);
        result += 2;
        System.out.println("result += (1 + 2) = " + result);
        result *= 10;
        System.out.println("result *= (3 * 10) = " + result);
        result /= 3;
        System.out.println("result /= (30 / 3) = " + result);
        result -= 2;
        System.out.println("result -= (10 - 2) = " + result);
    }
}
