package classes;

import interfaces.ICalculateSalary;

import java.util.Date;

public abstract class Employee extends Person implements ICalculateSalary {
    private static int idCount;
    private String employeeId;
    private Date startDate;
    private Date endDate;
    private double salary;



}
