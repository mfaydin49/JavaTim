package section_3_Primitive_If;

public class A_PrimitiveType_Int_Byte_Short_Long {
    public static void main(String[] args) {
        int myValue = 10_000;
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println("Integar Min:" + myMinValue);
        System.out.println("Integar Max:" + myMaxValue);
        System.out.println("Busted Max:" + (myMaxValue + 1)); //overFlow
        System.out.println("Busted Min:" + (myMinValue - 1)); //underFlow

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min:" + myMinByteValue);
        System.out.println("Byte Max:" + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min:" + myMinShortValue);
        System.out.println("Short Max:" + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min:" + myMinLongValue);
        System.out.println("Long Max:" + myMaxLongValue);

        byte myNewByteValue = (byte) (myMinByteValue/2); //casting
        short myNewShortValue = (short) (myMinShortValue/2);
    }
}
