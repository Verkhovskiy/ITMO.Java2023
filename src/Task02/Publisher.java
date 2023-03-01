package Task02;

public enum Publisher {
    Penguin("Penguin/Random House", "USA"),
    Hachette("Hachette Book Group", "USA"),
    HarperCollins("Harper Collins", "USA"),
    SimonAndSchuster("Simon and Schuster", "USA"),
    Macmillan("Macmillan", "USA");

    Publisher(String name, String country) {
        this.name = name;
        this.country = country;
    }

    private final String name;
    private final String country;
    public String getName(){
        return name;
    }
    public String getCountry(){
        return country;
    }
}
