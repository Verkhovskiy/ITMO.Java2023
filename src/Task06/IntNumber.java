package Task06;

import java.util.Scanner;

public class IntNumber {
    Scanner scan = new Scanner(System.in);
    protected int thisNumber;
    public IntNumber() {
        System.out.println("Input number:");
        thisNumber = scan.nextInt();
    }
}
