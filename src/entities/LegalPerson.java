package entities;

public class LegalPerson extends TaxPayer{

    private double worker;

    public LegalPerson(String name, Double income, double worker) {
        super(name, income);
        this.worker = worker;
    }

    public double getWorker() {
        return worker;
    }

    public void setWorker(double worker) {
        this.worker = worker;
    }

    @Override
    public double totalTax() {
        if (worker > 10){
            return income * 0.14;
        }
        else {
            return income * 0.16;
        }
    }
}
