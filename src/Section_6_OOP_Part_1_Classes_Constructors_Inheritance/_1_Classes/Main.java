package Section_6_OOP_Part_1_Classes_Constructors_Inheritance._1_Classes;

public class Main {
    public static void main(String[] args) {
        A_Car porsche = new A_Car();
        A_Car holden = new A_Car();
        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());
    }
}
