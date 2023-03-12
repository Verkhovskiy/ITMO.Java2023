package Task06;

public class IntNumberChild extends IntNumber{
    public int getNumber () {
        System.out.println("The number is: " + super.thisNumber);
        return super.thisNumber;
    }
}
