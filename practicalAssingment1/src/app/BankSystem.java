package app;

import classes.Bank;

import java.util.Scanner;

public class BankSystem {
    private Bank LocalBank;
    private boolean exit = false;
    private int option = 0;
    private int clientOption = 0;


    public BankSystem() {
        this.LocalBank = new Bank();
    }

    public void Menu (Scanner scan){
        System.out.println("Welcome to LocalBank, please select an option to start operating");

        while(!this.exit) {
            System.out.println("\n\tHow can we help you today?");
            System.out.println("1.- Operate with Clients");
            System.out.println("2.- Operate with Employees");
            System.out.println("3.- Operate with Accounts");
            System.out.println("9.- To quit");
            System.out.println("Your choice: ");
            this.option = scan.nextInt();
            switch(this.option) {
                case 1:
                    System.out.println("\nOption 1.- CLIENTS\n");
                    System.out.println("\nWhat would you like to do?\n");


                  //  System.out.println(listadoEmpleados.mostrarTodos());
                    break;
                case 2:
                    System.out.println("\nOption 2.- EMPLOYEES\n");
                 //   System.out.println(listadoEmpleados.mostrarTodosDatosBasicos());
                    break;
                case 3:
                    System.out.println("\nOption 3.- ACCOUNTS\n");
                 //   System.out.println(listadoEmpleados.getSueldoMayor().getDatosBasicos());
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

