package Task07;

public class Main {
    public static void main(String[] args) {
        Plane boeing = new Plane();
        Plane.Wing leftWing = boeing.new Wing();
        Plane.Wing rightWing = boeing.new Wing();
        leftWing.setWeight(1000);
        rightWing.setWeight(1200);
        leftWing.printWeight();
        rightWing.printWeight();
    }
}
