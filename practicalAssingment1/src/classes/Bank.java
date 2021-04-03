package classes;

import java.util.HashMap;
import java.util.HashSet;

public class Bank {
    private HashSet<Employee> bankEmployees = new HashSet<>();
    private HashMap<String, BankAccount> accounts = new HashMap<String, BankAccount>(); // where key is accountId
    private HashMap<String, Client> clients = new HashMap<String, Client>(); //where key is clientId

}
