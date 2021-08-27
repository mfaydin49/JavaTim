package codingExercise._33_Carpet_Cost_Calculator;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        this.cost = cost < 0 ? 0 : cost;
    }

    public double getCost() {

        return this.cost;
    }
}
