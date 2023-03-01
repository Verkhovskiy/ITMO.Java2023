package Task02;

public class Calculator {
    // СУММА
    public static Integer add(Integer a, Integer b) {
        return a+b;
    }
    public static Double add(Double a, Double b) {
        return a+b;
    }
    public static Long add(Long a, Long b) {
        return a+b;
    }

    // ДЕЛЕНИЕ
    public static Double divide(Integer a, Integer b) {
        return (double)a/b;
    }
    public static Double divide(Double a, Double b) {
        return a/b;
    }
    public static Double divide(Long a, Long b) {
        return (double)a/b;
    }

    // УМНОЖЕНИЕ
    public static Integer multiply(Integer a, Integer b) {
        return a*b;
    }
    public static Double multiply(Double a, Double b) {
        return a*b;
    }
    public static Long multiply(Long a, Long b) {
        return a*b;
    }

    // ВЫЧИТАНИЕ
    public static Integer subtract(Integer a, Integer b) {
        return a-b;
    }
    public static Double subtract(Double a, Double b) {
        return a-b;
    }
    public static Long subtract(Long a, Long b) {
        return a-b;
    }
}
