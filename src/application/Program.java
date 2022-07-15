package application;

import entities.LegalPerson;
import entities.NaturalPerson;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = scanner.nextInt();
        List<TaxPayer> taxPayerList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            scanner.nextLine();
            System.out.printf("Tax payer #%d data%n", i+1);
            System.out.print("Individual or company (i/c)? ");
            char ch = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Anual income: ");
            double income = scanner.nextDouble();

            if (ch == 'i'){
                System.out.println("Health expenditures: ");
                double healthExpenditure = scanner.nextDouble();
                taxPayerList.add(new NaturalPerson(name, income, healthExpenditure));
            }
            else if (ch == 'c'){
                System.out.println("Number of employees: ");
                int employeeCount = scanner.nextInt();
                taxPayerList.add(new LegalPerson(name, income, employeeCount));
            }
        }
        System.out.println("\nTAXES PAID:");
        for (TaxPayer person : taxPayerList) {
            System.out.println(person);
        }
    }
}
