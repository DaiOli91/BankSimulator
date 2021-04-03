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

    public Bank() {
        this.bankEmployees  = new HashSet<>();
        this.accounts = new HashMap<String, BankAccount>(); // where key is accountId
        this.clients = new HashMap<String, Client>(); //where key is clientId
    }
}
