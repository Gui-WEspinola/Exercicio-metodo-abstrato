package entities;

public class LegalPerson extends TaxPayer{

    private double EmployeeCount;

    public LegalPerson(String name, Double income, double EmployeeCount) {
        super(name, income);
        this.EmployeeCount = EmployeeCount;
    }

    public double getEmployeeCount() {
        return EmployeeCount;
    }

    public void setEmployeeCount(double employeeCount) {
        this.EmployeeCount = employeeCount;
    }

    @Override
    public double totalTax() {
        if (EmployeeCount > 10){
            return income * 0.14;
        }
        else {
            return income * 0.16;
        }
    }
    public String toString() {
        return getName() +
                ": $ " +
                String.format("%.2f", totalTax());
    }
}
