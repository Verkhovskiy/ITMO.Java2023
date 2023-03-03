package Task03;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car();
        Car ford = new Car("Blue",1500);
        bmw.setName("X5");
        ford.setName("Bronco");
        bmw.carInfo();
        ford.carInfo();
        System.out.println("=========================================");

        House mira3 = new House();
        House tverskaya10 = new House();
        mira3.setHouseInfo(5,1890,"Проспект Мира, 3");
        tverskaya10.setHouseInfo(8, 1935, "Улица Тверская, 10");
        mira3.houseInfo();
        int miraAge = mira3.houseAge();
        System.out.println("Возраст дома: " + miraAge);
        tverskaya10.houseInfo();
        int tverAge = tverskaya10.houseAge();
        System.out.println("Возраст дома: " + tverAge);
        System.out.println("=========================================");

        Tree oak = new Tree();
        Tree willow = new Tree(80, "Wollow");
        Tree walnut = new Tree(60, true, "Walnut");
    }
}
