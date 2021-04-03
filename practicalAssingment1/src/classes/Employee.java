package classes;

import interfaces.ICalculateSalary;

import java.time.LocalDate;


public abstract class Employee extends Person implements ICalculateSalary {
    private static int idCount = 1;
    private String employeeId;
    private LocalDate startDate;
    private LocalDate endDate;
    protected static double salary = 53600;

    public Employee() {
        this.employeeId = addIdCount();
        this.startDate = LocalDate.now();
        this.endDate = LocalDate.now();
    }
    public Employee(LocalDate startDate, LocalDate endDate, double salary) {
        this.employeeId = addIdCount();
        this.startDate = startDate;
        this.endDate = endDate;
        setSalary(salary);
    }

    public Employee(String idNumber, String firstName, String lastName, String nationality, LocalDate birthDate, LocalDate startDate, LocalDate endDate, double salary) {
        super(idNumber, firstName, lastName, nationality, birthDate);
        addIdCount();
        this.startDate = startDate;
        this.endDate = endDate;
        setSalary(salary);
    }


    public String getEmployeeId() {
        return employeeId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
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
