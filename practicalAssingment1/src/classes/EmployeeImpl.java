package classes;

import java.util.Date;

public class EmployeeImpl extends Employee {
    private static int employeeId;
    private Date startDate;
    private Date endDate;
    private double basicSalary;
    @Override
    public double annualSalary() {
        return basicSalary*12;
    }

    @Override
    public double increaseSalary(double percentage) {
        return this.basicSalary*(percentage/100);
    }
}
