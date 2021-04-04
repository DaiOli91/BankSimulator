package classes;

import classes.BankAccount;
import classes.Client;
import classes.Employee;

import java.util.HashMap;
import java.util.HashSet;

public class Bank {
    private HashSet<Employee> bankEmployees;
    private HashMap<String, BankAccount> accounts;
    private HashMap<String, Client> clients;

    ////////////////// CONSTRUCTORS
    public Bank() {
        this.bankEmployees  = new HashSet<>();
        this.accounts = new HashMap<String, BankAccount>(); // where key is accountId
        this.clients = new HashMap<String, Client>(); //where key is clientId
    }

    ////////////////// GETTERS

    public HashSet<Employee> getBankEmployees() {
        return bankEmployees;
    }

    public HashMap<String, BankAccount> getAccounts() {
        return accounts;
    }

    public HashMap<String, Client> getClients() {
        return clients;
    }


    ////////////////// SETTERS

    public void setBankEmployees(HashSet<Employee> bankEmployees) {
        this.bankEmployees = bankEmployees;
    }

    public void setAccounts(HashMap<String, BankAccount> accounts) {
        this.accounts = accounts;
    }

    public void setClients(HashMap<String, Client> clients) {
        this.clients = clients;
    }


    ////////////////// OTHERS

    ////////////////// OVERRIDDEN


    @Override
    public String toString() {
        return "Bank{" +
                "bankEmployees=" + bankEmployees +
                ", accounts=" + accounts +
                ", clients=" + clients +
                '}';
    }

}
