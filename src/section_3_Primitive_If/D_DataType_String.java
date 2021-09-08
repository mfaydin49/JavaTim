package section_3_Primitive_If;

public class D_DataType_String {
    public static void main(String[] args) {
        String myString ="This is a String";
        System.out.println("String:"  + myString);
        myString = myString + ", and this is more";
        System.out.println("String:" + myString);
        myString = myString + "\u00A9 2009";
        System.out.println("String:" + myString);
        String numberString ="250.25";
        numberString =numberString + "48.25";
        System.out.println(numberString);


    }
}
