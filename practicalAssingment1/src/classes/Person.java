package classes;

import java.time.LocalDate;
import java.util.UUID;


public abstract class Person {
    private String idNumber; //for this exercise we are not going to keep a record of registered people, so a counter will not be needed
    private String firstName;
    private String lastName;
    private String nationality;
    private LocalDate birthDate;

    ////////////////// CONSTRUCTORS
    public Person() {
        this.firstName = "";
        this.setEmployeeId();
        this.lastName = "";
        this.nationality = "";
        this.birthDate = LocalDate.now(); //LocalDate and LocalDateTime do not have Constructors, use static methods to set the date
    }
    public Person(String firstName, String lastName, String nationality, LocalDate birthDate) {
        this.setEmployeeId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.birthDate = birthDate;
    }
    ////////////////// GETTERS

    public String getIdNumber() {
        return idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }


    ////////////////// SETTERS

    public void setEmployeeId() { //generates a new random number in case this value already exists in a wrapper class
        UUID aux_idNumber;
        aux_idNumber = UUID.randomUUID();
        this.idNumber = aux_idNumber.toString().substring(0, 9); //I just need 10 digits long string
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


    ////////////////// OTHERS

    ////////////////// OVERRIDDEN

    @Override
    public String toString() {
        return "Person{" +
                "idNumber='" + idNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
