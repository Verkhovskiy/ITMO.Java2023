package Task06;

public class Truck extends Car {
    private int numWheels;
    private int maxLoad;

    public Truck(int w, String m, char c, float s, int numWheels, int maxLoad) {
        super(w, m, c, s);
        this.numWheels = numWheels;
        this.maxLoad = maxLoad;
    }
    public void newWheels (int numWheels) {
        this.numWheels = numWheels;
        System.out.println("Новое количество колес - " + this.numWheels);
    }
}
