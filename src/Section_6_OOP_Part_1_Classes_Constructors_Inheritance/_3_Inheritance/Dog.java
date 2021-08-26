package Section_6_OOP_Part_1_Classes_Constructors_Inheritance._3_Inheritance;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.coat = coat;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }


    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();

    }

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

private void moveLegs(int speed){
    System.out.println("Dog.moveLegs() called. Dog legs move " + speed + "speed");
}
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
