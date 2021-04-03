package classes;

import java.time.LocalDate;

public class SalesPerson extends Employee{
    private int monthlySales;
    private static double comission = 253.5; // ideallly, SalesPerson has a list of sold items, each with its own price and the employee gets paid a percentage of each final price
    //in this case, the SalesPerson will only get comission if monthlySales > 40.

    public SalesPerson() {
        this.monthlySales = 0;
    }

    public SalesPerson(LocalDate startDate, LocalDate endDate, double salary, int monthlySales) {
        super(startDate, endDate, salary);
        this.monthlySales = monthlySales;
    }

    public SalesPerson(String idNumber, String firstName, String lastName, String nationality, LocalDate birthDate, LocalDate startDate, LocalDate endDate, double salary, int monthlySales) {
        super(idNumber, firstName, lastName, nationality, birthDate, startDate, endDate, salary);
        this.monthlySales = monthlySales;
    }

    @Override
    public double annualSalary() {

        return Employee.salary*12;
    }

    @Override
    public double increaseSalary(double percentage) {
        return 0;
    }
}
