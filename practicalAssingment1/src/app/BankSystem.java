package app;

import classes.Bank;

import java.util.Scanner;

public class BankSystem {
    private Bank LocalBank;
    public BankSystem() {
        this.LocalBank = new Bank();
    }

    public void Menu (Scanner scan){
        System.out.println("Welcome to LocalBank, please select an option to start operating");

    }
}
