package entities;

public abstract class TaxPayer {

    private String name;
    private String income;


    public TaxPayer() {
    }

    public TaxPayer(String name, String income) {
        this.name = name;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public abstract double totalTax();

}
