package app;

import classes.Bank;

import java.util.Scanner;

public class BankSystem {
    private Bank LocalBank;
    private boolean exit = false;
    private int option = 0;
    private int innerOption = 0; //additional variable just in case


    public BankSystem() {
        this.LocalBank = new Bank();
    }

    public void Menu(Scanner scan) {
        System.out.println("Welcome to LocalBank, please select an option to start operating");

        while (!this.exit) {
            System.out.println("\n\tHow can we help you today?");
            System.out.println("1.- Operate with Clients");
            System.out.println("2.- Operate with Employees");
            System.out.println("3.- Operate with Accounts");
            System.out.println("4.- Cash Machine Simulator");
            System.out.println("9.- To quit");
            System.out.println("Your choice: ");
            this.option = scan.nextInt();
            switch (this.option) {
                case 1:
                    System.out.println("\nOption 1.- CLIENTS\n");
                    System.out.println("\nWhat would you like to do?\n");
                    System.out.println("1.- See Clients List");
                    System.out.println("2.- Look for a Client");
                    System.out.println("3.- Add a new Client");
                    System.out.println("4.- Modify a Client");
                    System.out.println("Your choice: ");
                    this.option = scan.nextInt();
                    switch (this.option) {
                        case 1:
                            System.out.println("\nOption 1.- Show Client List\n");
                            System.out.println(this.LocalBank.clientsToString());

                            break;
                        case 2:
                            System.out.println("\nOption 2.- Look for a Client\n");
                            System.out.println("\nPlease enter the Client Id Number\n");
                            //TODO search client

                            break;
                        case 3:
                            System.out.println("\nOption 3.- Add a new Client\n");
                            //TODO add a client

                            break;
                        case 4:
                            System.out.println("\nOption 4.- Modify a Client\n");
                            System.out.println("\nPlease enter the Client Id Number\n");
                            //TODO modify client

                            break;
                        default:
                            System.out.println("\nI am afraid this option is not available.");
                    }


                    //  end of Case1 main Switch
                    break;
                case 2:
                    System.out.println("\nOption 2.- EMPLOYEES\n");
                    // TODO Employees option
                    break;
                case 3:
                    System.out.println("\nOption 3.- ACCOUNTS\n");
                    //  TODO Accounts option
                    break;
                case 4:
                    System.out.println("\nOption 4.- Cash Machine Simulator\n");
                    // TODO Simulator switch
                    break;
                case 9:
                    System.out.println("\nOption 9.- Thank you for operating with us.\n");
                    this.exit = true;
                    break;
                default:
                    System.out.println("\nI am afraid this option is not available.");
            }
        }
        System.out.println("Have a nice day!");
    }

}

