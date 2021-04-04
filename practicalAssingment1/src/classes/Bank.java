package classes;

import classes.BankAccount;
import classes.Client;
import classes.Employee;

import java.util.HashMap;

public class Bank {
    private HashMap<String, Employee> bankEmployees;
    private HashMap<String, BankAccount> accounts;
    private HashMap<String, Client> clients;

    ////////////////// CONSTRUCTORS
    public Bank() {
        this.bankEmployees  = new HashMap<String, Employee>();
        this.accounts = new HashMap<String, BankAccount>(); // where key is accountId
        this.clients = new HashMap<String, Client>(); //where key is clientId
    }

    ////////////////// GETTERS

    public String getBankEmployees() {
        StringBuilder sb = new StringBuilder();

        return "";
    }

    public HashMap<String, BankAccount> getAccounts() {
        return accounts;
    }

    public HashMap<String, Client> getClients() {
        return clients;
    }


    ////////////////// SETTERS

    public Employee editEmployee(Employee bankEmployee) {
        if(this.bankEmployees.containsKey(bankEmployee.getEmployeeId())) {
            return this.bankEmployees.put(bankEmployee.getEmployeeId(), bankEmployee);
        } else {
            Employee aux_employee = new Employee();

            return aux_employee;

        }
    }

    public BankAccount editAccount(BankAccount account) {
        if(this.accounts.containsKey(account.getIdAccount())) {
            return this.accounts.put(account.getIdAccount(), account);
        } else {
            BankAccount aux_account = new BankAccount();

            return aux_account;

        }
    }

    public Client editClient(Client client) {
        if(this.clients.containsKey(client.getClientId())) {
            return this.clients.put(client.getClientId(), client);
        } else {
            Client aux_client = new Client();

            return aux_client;

        }
    }

    ////////////////// OTHERS
    public Employee getEmployee(String employeeId){
        return this.bankEmployees.get(employeeId);
    }

    public BankAccount getAccount(String accountId){
        return this.accounts.get(accountId);
    }

    public Client getClient(String clientId){
        return this.clients.get(clientId);
    }

    public Employee addEmployee(Employee bankEmployee) {
        return this.bankEmployees.put(bankEmployee.getEmployeeId(), bankEmployee);
    }

    public BankAccount addAccount(BankAccount account) {
        return this.accounts.put(account.getIdAccount(), account);
    }

    public Client addClient(Client client) {
        return this.clients.put(client.getClientId(), client);
    }


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
