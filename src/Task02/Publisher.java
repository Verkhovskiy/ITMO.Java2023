package Task02;

public enum Publisher {
    PENGUIN("Penguin/Random House", "USA"),
    HACHETTE("Hachette Book Group", "USA"),
    HARPERCOLLINS("Harper Collins", "USA"),
    SIMONANDSCHUSTER("Simon and Schuster", "USA"),
    MACMILLAN("Macmillan", "USA");

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
