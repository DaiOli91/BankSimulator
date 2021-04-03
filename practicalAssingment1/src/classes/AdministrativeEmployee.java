package classes;

import java.text.SimpleDateFormat;
import java.time.LocalDate;


public class AdministrativeEmployee extends Employee{
    private double experience;
    private double actualSalary;

    public AdministrativeEmployee() {
        super();
        this.experience = 0; //in years
    }
    public AdministrativeEmployee(LocalDate startDate, LocalDate endDate, double salary, double experience) {
        super(startDate, endDate, salary);
        this.experience = experience;
    }

    public double getExperience() {
        return experience;
    }

    //TODO search for a method to modify start and end dates to calculate experience w/o SimpleDateFormat
    public void setExperience() {
        LocalDate today = LocalDate.now();
        SimpleDateFormat spd = new SimpleDateFormat("yyyy"); //to bring only the year of this date as a String
        int thisYear;
        thisYear = Integer.parseInt(spd.format(today).toUpperCase()); //parseInt to transform String to int

        int startYear;
        startYear = Integer.parseInt(spd.format(super.getStartDate()).toUpperCase());

        this.experience = thisYear - startYear;
    }

    public double getActualSalary() {
        return actualSalary;
    }

    public void setActualSalary() { //calculates 10% for less than 4 years of experience, 15% up to 15 years and 25% for the rest
        double percentage;
        if (this.experience <= 4 ) {
            percentage = 1.1;
            this.actualSalary = super.getSalary()*percentage;
        } else if (this.experience > 4 && this.experience <= 15) {
                percentage = 1.15;
            }
        else {
            percentage = 1.25;
        }
            this.actualSalary = super.getSalary()*percentage;
    }

    @Override
    public double annualSalary() {
        return this.actualSalary*12;
    }

    @Override
    public double increaseSalary(double percentage) {
        return 0;
    }
}
