package Task02;

public class Main {
    public static void main(String[] args) {
        Book harryPotter = new Book(
                "Harry Potter",
                "J. K. Rowling",
                Publisher.MACMILLAN,
                1997,
                345,
                true);
        System.out.println(harryPotter.getName());
        System.out.println(harryPotter.getPublisher().getName());

        Integer result1 = Calculator.add(10,5);
        System.out.println(result1);

        Integer a = 10;
        Integer b = 3;
        Double result2 = Calculator.divide(a,b);
        System.out.println(result2);
    }
}
