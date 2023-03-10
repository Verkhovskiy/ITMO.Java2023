package Task06;

public abstract class Human {
    private String name;
    private String surname;
    abstract void printInfo();

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
