package classes;

import java.util.ArrayList;
import java.util.HashMap;

public class Bank {
    private ArrayList<Employee> bankEmployees = new ArrayList<Employee>();
    private HashMap<String, BankAccount> accounts = new HashMap<String, BankAccount>(); // where key is accountId
    private HashMap<String, Client> clients = new HashMap<String, Client>(); //where key is clientId

}
