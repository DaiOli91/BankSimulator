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
        this.setIdNumber();
        this.lastName = "";
        this.nationality = "";
        this.birthDate = LocalDate.now(); //LocalDate and LocalDateTime do not have Constructors, use static methods to set the date
    }
    public Person(String firstName, String lastName, String nationality, LocalDate birthDate) {
        this.setIdNumber();
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
    public void setIdNumber() { //generates a new random number and converts it to String
            String aux_IdNumber="";

                aux_IdNumber = String.valueOf(Math.random() * 10 + 48); //generates the double

            this.idNumber = aux_IdNumber.substring(3, 11); //chooses just a part of the decimals
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
        return "First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "DNI: " + idNumber + "\n" +
                "Nationality: " + nationality + "\n" +
                "BirthDate: " + birthDate + "\n";
    }
}
