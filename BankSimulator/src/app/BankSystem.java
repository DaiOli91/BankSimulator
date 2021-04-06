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
                            System.out.println("\nThis option is not available.");
                    }


                    //  end of Case1 main Switch
                    break;
                case 2:
                    System.out.println("\nOption 1.- EMPLOYEES\n");
                    System.out.println("\nWhat would you like to do?\n");
                    System.out.println("1.- See Employees List");
                    System.out.println("2.- Look for an Employee");
                    System.out.println("3.- Add a new Employee");
                    System.out.println("4.- Modify an Employee");
                    System.out.println("Your choice: ");
                    this.option = scan.nextInt();
                    switch (this.option) {
                        case 1:
                            System.out.println("\nOption 1.- Show Employees List\n");
                            System.out.println(this.LocalBank.employeesToString());

                            break;
                        case 2:
                            System.out.println("\nOption 2.- Look for an Employee\n");
                            System.out.println("\nPlease enter the Employee Id Number\n");
                            //TODO search client

                            break;
                        case 3:
                            System.out.println("\nOption 3.- Add a new Employee\n");
                            //TODO add a client

                            break;
                        case 4:
                            System.out.println("\nOption 4.- Modify an Employee\n");
                            System.out.println("\nPlease enter the Employee Id Number\n");
                            //TODO modify client

                            break;
                        default:
                            System.out.println("\nThis option is not available.");
                    }
                    break;
                    // end of Case 2 Main Switch
                case 3:
                    System.out.println("\nOption 1.- ACCOUNTS\n");
                    System.out.println("\nWhat would you like to do?\n");
                    System.out.println("1.- See Accounts List");
                    System.out.println("2.- Look for an Account");
                    System.out.println("3.- Add a new Account");
                    System.out.println("4.- Modify an Account");
                    System.out.println("Your choice: ");
                    this.option = scan.nextInt();
                    switch (this.option) {
                        case 1:
                            System.out.println("\nOption 1.- Show Accounts List\n");
                            System.out.println(this.LocalBank.bankAccountsToString());

                            break;
                        case 2:
                            System.out.println("\nOption 2.- Look for an Account\n");
                            System.out.println("\nPlease enter the Account Id Number\n");
                            //as an option, a person could enter the Client (owner- ClientId) and bring back all the accounts associated to it
                            //TODO search client

                            break;
                        case 3:
                            System.out.println("\nOption 3.- Add a new Account\n");
                            //TODO add a client

                            break;
                        case 4:
                            System.out.println("\nOption 4.- Modify an Account\n");
                            System.out.println("\nPlease enter the Account Id Number\n");
                            //TODO modify client

                            break;
                        default:
                            System.out.println("\nThis option is not available.");
                    }
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

