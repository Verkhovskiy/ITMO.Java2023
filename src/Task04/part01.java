package Task04;

import java.util.Scanner;

public class part01 {
    public static void main(String[] args) {
        //countToNinetyNine();

        //dividersV1();
        //dividersV2();

        /*
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        boolean result1 = isSumEquals(a, b, c);
        System.out.println(result1);
        */

        /*
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        boolean result2 = isIncreasing(a, b, c);
        System.out.println(result2);
        */

        /*
        int[] numbers = {3,10,-550,600,-10,2,5};
        boolean result3 = isThreeStartEnd(numbers);
        System.out.println(result3);
        */

        /*
        int[] numbers = {10,-550,1,600,-10,2,5};
        boolean result3 = isContainingThree(numbers);
        System.out.println(result3);
        */
    }
    public static void countToNinetyNine() {
        for (int i = 1; i < 100; i+=2) {
            System.out.println(i);
        }
    }
    public static void dividersV1() {
        for (int i = 1; i < 101; i++) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.println("Делится на 3 и на 5: " + i);
            } else if (i%3 == 0) {
                System.out.println("Делится на 3: " + i);
            } else if (i%5 == 0) {
                System.out.println("Делится на 5: " + i);
            }
        }
    }
    public static void dividersV2() {
        System.out.println("Делится на 3:");
        for (int i = 3; i < 101; i+=3) {
            if (i%5 != 0) {
                System.out.println(i);
            }
        }
        System.out.println("Делится на 5:");
        for (int i = 5; i < 101; i+=5) {
            if (i%3 != 0) {
                System.out.println(i);
            }
        }
        System.out.println("Делится на 3 и на 5:");
        for (int i = 3; i < 101; i+=3) {
            if (i%5 == 0) {
                System.out.println(i);
            }
        }
    }
    public static boolean isSumEquals(int a, int b, int c) {
        int sum = a + b;
        return sum == c;
    }
    public static boolean isIncreasing(int a, int b, int c) {
        return b > a && c > b;
    }
    public static boolean isThreeStartEnd(int... numbers) {
        return numbers[0] == 3 || numbers[numbers.length-1] == 3;
    }
    public static boolean isContainingThree(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 3) {
                return true;
            }
        }
        return false;
    }
}
