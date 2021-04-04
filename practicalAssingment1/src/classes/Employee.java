package classes;

import interfaces.ICalculateSalary;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;


public abstract class Employee extends Person implements ICalculateSalary {
    private static int idCount = 0;
    private String employeeId;
    private LocalDate startDate;
    private LocalDate endDate;
    protected static double salary = 53600;

    ////////////////// CONSTRUCTORS
    public Employee() {
        addIdCount();
        this.setEmployeeId();
        this.startDate = LocalDate.now();
        this.endDate = LocalDate.now();
    }

    public Employee(LocalDate startDate, LocalDate endDate, double salary) {
        addIdCount();
        this.setEmployeeId();
        this.startDate = startDate;
        this.endDate = endDate;
        setSalary(salary);
    }

    public Employee(String idNumber, String firstName, String lastName, String nationality, LocalDate birthDate, LocalDate startDate, LocalDate endDate, double salary) {
        super(firstName, lastName, nationality, birthDate);
        addIdCount();
        this.startDate = startDate;
        this.endDate = endDate;
        setSalary(salary);
    }

    ////////////////// GETTERS
    public String getEmployeeId() {
        return employeeId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public double getSalary() {
        return salary;
    }

    ////////////////// SETTERS
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    private static void setSalary(double newSalary) {
        salary = newSalary;
    }

    public void setEmployeeId(){ //generates a random UUID value in case the existent value already exists in the wrapper list
        UUID aux_employeeId;
        aux_employeeId = UUID.randomUUID();
        this.employeeId = aux_employeeId.toString().substring(0, 8); //I just need 10 digits string
    }

    ////////////////// OVERRIDDEN
    @Override
    public String toString() {
        return super.toString() +
                "Employee number: " + employeeId + "\n" +
                "From: " + startDate + "\n" +
                "To: " + endDate + "\n" +
                "Basic salary: " + salary + "\n";
    }
    @Override
    public double increaseSalary(double percentage) {
        Employee.salary = salary * (percentage * 0.01);
        return Employee.salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getEmployeeId().equals(employee.getEmployeeId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployeeId());
    }

    ////////////////// OTHERS
    private static void addIdCount() {
        Employee.idCount++;
    }
}
