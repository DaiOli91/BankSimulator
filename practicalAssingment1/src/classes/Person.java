package classes;

import java.util.Date;

public abstract class Person {
    private String idNumber;
    private String firstName;
    private String lastName;
    private String nationality;
    private Date birthDate;

    public Person() {
        this.idNumber = "";
        this.firstName = "";
        this.lastName = "";
        this.nationality = "";
        this.birthDate = new Date();
    }
    public Person(String idNumber, String firstName, String lastName, String nationality, Date birthDate) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.birthDate = birthDate;
    }
}
