package Task06;

public class UserChild extends User{
    public void setName() {
        System.out.println("Input name:");
        super.setName(scan.nextLine());
    }
}
