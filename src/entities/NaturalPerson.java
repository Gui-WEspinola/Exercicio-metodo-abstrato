package entities;

public class NaturalPerson extends TaxPayer{

    private double healthExpenditure;

    public NaturalPerson(String name, Double income, double healthExpenditure) {
        super(name, income);
        this.healthExpenditure = healthExpenditure;
    }

    public double getHealthExpenditure() {
        return healthExpenditure;
    }

    public void setHealthExpenditure(double healthExpenditure) {
        this.healthExpenditure = healthExpenditure;
    }

    @Override
    public double totalTax() {
        if (income < 20000.00){
            return income * 0.15 - healthExpenditure * 0.50;
        }
        else {
            return income * 0.25 - healthExpenditure * 0.50;
        }
    }

    @Override
    public String toString() {
        return getName() +
                ": $ " +
                String.format("%.2f", totalTax());
    }
}
