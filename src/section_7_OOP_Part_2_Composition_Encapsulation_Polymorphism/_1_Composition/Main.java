package section_7_OOP_Part_2_Composition_Encapsulation_Polymorphism._1_Composition;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("200B", "Dell", "240", dimensions);
        Monitor theMonitor = new Monitor("Beast", "Acer", 27, new Resolution(2540, 1440));
        MotherBoard theMotherBoard = new MotherBoard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePc = new PC(theMonitor, theMotherBoard, theCase);
        thePc.powerUp();
    }
}
