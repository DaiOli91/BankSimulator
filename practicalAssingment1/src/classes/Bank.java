package classes;

import classes.BankAccount;
import classes.Client;
import classes.Employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
        if(this.bankEmployees.containsKey(employeeId)) {
            return this.bankEmployees.get(employeeId);
        } else {
            Employee aux_employee = new Employee();

            return aux_employee;

        }
    }


    public BankAccount getAccount(String accountId){
        if(this.accounts.containsKey(accountId)) {
            return this.accounts.get(accountId);
        } else {
            BankAccount aux_account = new BankAccount();

            return aux_account;

        }
    }


    public Client getClient(String clientId){
        if(this.clients.containsKey(clientId)) {
            return this.clients.get(clientId);
        } else {
            Client aux_client = new Client();

            return aux_client;

        }
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
    public String toString() { //bank
        StringBuilder sb =  new StringBuilder();
        sb.append(employeesToString());
        sb.append(bankAccountsToString());
        sb.append(clientsToString());
        return sb.toString();
    }


    public String employeesToString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nEmployees list\n");
        Set<Map.Entry<String, Employee>> setAux = this.bankEmployees.entrySet();
        Iterator<Map.Entry<String, Employee>> itAux = setAux.iterator();

        while (itAux.hasNext()){
            Map.Entry<String, Employee> map_entry = (Map.Entry<String, Employee>) itAux.next();
            Employee auxEmployee = (Employee) map_entry.getValue();
            sb.append(auxEmployee.toString());
        }
        sb.append("\n\n");
        return sb.toString();
    }

    public String bankAccountsToString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nAccounts list\n");
        Set<Map.Entry<String, BankAccount>> setAux = this.accounts.entrySet();
        Iterator<Map.Entry<String, BankAccount>> itAux = setAux.iterator();

        while (itAux.hasNext()){
            Map.Entry<String, BankAccount> map_entry = (Map.Entry<String, BankAccount>) itAux.next();
            BankAccount auxAccount = (BankAccount) map_entry.getValue();
            sb.append(auxAccount.toString());
        }
        sb.append("\n\n");
        return sb.toString();
    }

    public String clientsToString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nClients list\n");
        Set<Map.Entry<String, Client>> setAux = this.clients.entrySet();
        Iterator<Map.Entry<String, Client>> itAux = setAux.iterator();

        while (itAux.hasNext()){
            Map.Entry<String, Client> map_entry = (Map.Entry<String, Client>) itAux.next();
            Client auxClient = (Client) map_entry.getValue();
            sb.append(auxClient.toString());
        }
        sb.append("\n\n");
        return sb.toString();
    }

}
