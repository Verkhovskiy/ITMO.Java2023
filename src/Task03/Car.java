package Task03;

public class Car {
    private String color;
    private String name;
    private Integer weight;

    public Car() {
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, Integer weight) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + ": " +
                "color - " + color +
                ", weight - " + weight;
    }

    public void carInfo() {
        System.out.println(this.toString());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
