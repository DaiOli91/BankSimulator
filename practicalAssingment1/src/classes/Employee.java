package classes;

import interfaces.ICalculateSalary;

import java.util.Date;

public abstract class Employee extends Person implements ICalculateSalary {
    private static int idCount = 1;
    private String employeeId;
    private Date startDate;
    private Date endDate;
    private static double salary = 53600;

    public Employee() {
        this.employeeId = addIdCount();
        this.startDate = new Date();
        this.endDate = new Date();
    }
    public Employee(Date startDate, Date endDate, double salary) {
        this.employeeId = addIdCount();
        this.startDate = startDate;
        this.endDate = endDate;
        setSalary(salary);
    }

    public Employee(String idNumber, String firstName, String lastName, String nationality, Date birthDate, Date startDate, Date endDate, double salary) {
        super(idNumber, firstName, lastName, nationality, birthDate);
        addIdCount();
        this.startDate = startDate;
        this.endDate = endDate;
        setSalary(salary);
    }


    public String getEmployeeId() {
        return employeeId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getSalary() {
        return salary;
    }

    private static void setSalary(double newSalary) {
        salary = newSalary;
    }

    private static String addIdCount(){
        idCount++;
        return String.valueOf(idCount);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", salary=" + salary +
                '}';
    }
}
