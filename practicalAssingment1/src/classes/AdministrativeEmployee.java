package classes;

import java.util.Date;

public class AdministrativeEmployee extends Employee{
    private double experience;

    public AdministrativeEmployee() {
        super();
        this.experience = 0;
    }
    public AdministrativeEmployee(Date startDate, Date endDate, double salary, double experience) {
        super(startDate, endDate, salary);
        this.experience = experience;
    }

    @Override
    public double annualSalary() {
        return 0;
    }

    @Override
    public double increaseSalary(double percentage) {
        return 0;
    }
}
