package Task06;

import java.util.Scanner;

public class User {
    protected Scanner scan = new Scanner(System.in);
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Input age:");
        this.age = scan.nextInt();
    }
}
