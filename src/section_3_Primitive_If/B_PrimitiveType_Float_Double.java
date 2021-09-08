package section_3_Primitive_If;

public class B_PrimitiveType_Float_Double {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Min:" + myMinFloatValue);
        System.out.println("Float Max:" + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Min:" + myMinDoubleValue);
        System.out.println("Double Max:" + myMaxDoubleValue);

        int myIntValue=5/2;
        float myFloatValue=5f/2f;
        double myDoubleValue=5d;
        System.out.println("Int:" + myIntValue);
        System.out.println("Float:" + myFloatValue);
        System.out.println("Double:" + myDoubleValue);
    }
}
