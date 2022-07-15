package entities;

public class NaturalPerson extends TaxPayer{

    private double healthSpending;

    public NaturalPerson(String name, Double income, double healthSpending) {
        super(name, income);
        this.healthSpending = healthSpending;
    }

    public double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(double healthSpending) {
        this.healthSpending = healthSpending;
    }

    @Override
    public double totalTax() {
        if (income < 20000.00){
            return income * 0.15 - healthSpending * 0.50;
        }
        else {
            return income * 0.25 - healthSpending * 0.50;
        }
    }
}
