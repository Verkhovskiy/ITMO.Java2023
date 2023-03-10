package Task06;

public class Main {
    public static void main(String[] args) {
        Client ivan = new Client("Иванов","Иван", "Лучший Банк");
        Employee peter = new Employee("Петр", "Петров", "Надежный Банк");
        ivan.printInfo();
        ivan.printBankInfo();
        peter.printInfo();
        peter.printBankInfo();

        Truck scania = new Truck(5000, "Scania", 'W', 100, 6, 4000);
        scania.newWheels(4);

        IntNumberChild myNumber = new IntNumberChild();
        myNumber.getNumber();

        UserChild myUser = new UserChild();
        myUser.setName();
        System.out.println("User's name is: " + myUser.getName());
    }
}
