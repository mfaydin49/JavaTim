package Section_7_OOP_Part_2_Composition_Encapsulation_Polymorphism._1_Composition;

public class Car extends Vehicle{

    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }

}
