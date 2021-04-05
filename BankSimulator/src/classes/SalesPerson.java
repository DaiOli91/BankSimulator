package classes;

import java.time.LocalDate;

public class SalesPerson extends Employee {
    private int monthlySales;
    //private double comission; // ideallly, SalesPerson has a list of sold items, each with its own price and the employee gets paid a percentage of each final price
    //in this case, there will be 3 options:12,5%, 25% or 50% of the base salary
    private double actualSalary;

    ////////////////// CONSTRUCTORS
    public SalesPerson() {

        this.monthlySales = 0;
        this.actualSalary = super.getSalary();
    }

    public SalesPerson(LocalDate startDate, LocalDate endDate, double salary, int monthlySales) {
        super(startDate, endDate, salary);
        this.monthlySales = monthlySales;
    }

    public SalesPerson(String idNumber, String firstName, String lastName, String nationality, LocalDate birthDate, LocalDate startDate, LocalDate endDate, double salary, int monthlySales) {
        super(idNumber, firstName, lastName, nationality, birthDate, startDate, endDate, salary);
        this.monthlySales = monthlySales;
    }
    ////////////////// GETTERS
    public int getMonthlySales() {
        return monthlySales;
    }

    public double getActualSalary() {
        if (this.monthlySales>=15 && this.monthlySales <= 30){
            this.actualSalary = this.actualSalary*1.125;
        }else
        if (this.monthlySales>30 && this.monthlySales <= 55){
            this.actualSalary = this.actualSalary*1.25;
        }else if (this.monthlySales>55){
            this.actualSalary = this.actualSalary*1.5;
        } //if <15 no comission

        return actualSalary;
    }

    ////////////////// SETTERS
    public void setMonthlySales(int monthlySales) {
        this.monthlySales = monthlySales;
    }
/*
    public void setComission(double comission) {
        this.comission = comission;
    }

    public void setActualSalary(double actualSalary) {
        this.actualSalary = actualSalary;
    }
 */

    ////////////////// OTHERS

    ////////////////// OVERRIDDEN
    @Override
    public double annualSalary() {

        return Employee.salary * 12;
    }


    @Override
    public String toString() {
        return super.toString() + "Area: Sales \n" +
                "Monthly Sales:" + monthlySales + "\n";
    }
}
