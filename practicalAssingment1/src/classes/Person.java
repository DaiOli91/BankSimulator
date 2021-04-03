package classes;

import java.time.LocalDate;


public abstract class Person {
    private String idNumber;
    private String firstName;
    private String lastName;
    private String nationality;
    private LocalDate birthDate;

    public Person() {
        this.idNumber = "";
        this.firstName = "";
        this.lastName = "";
        this.nationality = "";
        this.birthDate = LocalDate.now(); //LocalDate and LocalDateTime do not have Constructors, use static methods to set the date
    }
    public Person(String idNumber, String firstName, String lastName, String nationality, LocalDate birthDate) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.birthDate = birthDate;
    }
}
