package Task06;

public class UserChild extends User{
    @Override
    public void setInfo() {
        System.out.println("Input name:");
        super.setName(scan.nextLine());
        System.out.println("Updated name is: " + super.getName());
    }
}
