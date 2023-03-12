package Task06;

public class Employee extends Human implements BankRelation {
    private String bankName;

    public Employee(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }
    @Override
    void printInfo() {
        System.out.println("*** Работник банка ***");
        System.out.println("Имя            - " + this.getName());
        System.out.println("Фамилия        - " + this.getSurname());
        System.out.println("Название банка - " + this.bankName);
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public void printBankInfo() {
        System.out.println("Работник банка " + this.bankName);
    }
}
