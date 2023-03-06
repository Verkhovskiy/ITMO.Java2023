package Task04;

import java.util.Arrays;
import java.util.Scanner;

public class part02 {
    public static void main(String[] args) {
        /*
        int[] numbers1 = {10,-550,1,600,-10,2,5};
        boolean result1 = isSorted(numbers1);
        int[] numbers2 = {-110,-50,1,60,100,200,540};
        boolean result2 = isSorted(numbers2);
        */

        //int[] ints = inputArray();

        //int[] numbers3 = {10,-550,1,600,-10,2,5};
        //swapFirstLast(numbers3);

        /*
        int[] numbers4 = {10,-550,10,600,-10,600,2,5,-550};
        int result3 = firstUniqueNumber(numbers4);
        System.out.println(result3);
        */
    }
    public static boolean isSorted(int... numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i-1]) {
                System.out.println("Please, try again");
                return false;
            }
        }
        System.out.println("OK");
        return true;
    }
    public static int[] inputArray() {
        System.out.println("Array length:");
        Scanner scan = new Scanner(System.in);
        int arrayLength = scan.nextInt();
        int[] ints = new int[arrayLength];
        System.out.println("Numbers of array:");
        for (int i = 0; i < arrayLength; i++) {
            int newInt = scan.nextInt();
            ints[i] = newInt;
        }
        System.out.println("Result: " + Arrays.toString(ints));
        return ints;
    }
    public static void swapFirstLast(int... numbers) {
        System.out.println("Array 1: " + Arrays.toString(numbers));
        int first = numbers[0];
        int last = numbers[numbers.length-1];
        numbers[0] = last;
        numbers[numbers.length-1] = first;
        System.out.println("Array 2: " + Arrays.toString(numbers));
    }

    public static int firstUniqueNumber(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                }
                if (numbers[i] == numbers[j]) {
                    break;
                } else if (j == numbers.length - 1) {
                    return numbers[i];
                }
            }
        }
        return 0;
    }
}
