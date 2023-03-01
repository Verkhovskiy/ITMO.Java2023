package Task02;

public class Main {
    public static void main(String[] args) {
        Book harryPotter = new Book(
                "Harry Potter",
                "J. K. Rowling",
                Publisher.Macmillan,
                1997,
                345,
                true);
        System.out.println(harryPotter.getName());
        System.out.println(harryPotter.getPublisher().getName());
        Integer result = Calculator.add(10,5);
        System.out.println(result);
    }
}
