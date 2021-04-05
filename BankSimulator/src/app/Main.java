package app;

import classes.Bank;
import classes.Person;
import classes.SalesPerson;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BankSystem bank = new BankSystem();

        bank.Menu(scan);

        Person person1 = new SalesPerson();
        person1.setNationality("Argentinian");
        person1.setFirstName("Joel");
        person1.setLastName("Solomillo");

        System.out.println(person1.toString());
    }
}
