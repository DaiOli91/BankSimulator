package app;

import classes.Bank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BankSystem bank = new BankSystem();

        bank.Menu(scan);
    }
}
