package classes;

import java.util.UUID;

public class BankAccount {
    private static int idCount = 0;
    private String idAccount;
    private double balance;
    private int type; //as in 1 for Current Account, 2 for Salary Account and 3 for Fixed Deposit Account

    ////////////////// CONSTRUCTORS
    public BankAccount() { //default type = 2 : Salary Account- Balance= 0;
        addBankAccountCounter();
        this.setIdAccount();
        this.balance = 0;
        this.type = 2;
    }

    public BankAccount(int type) {
        addBankAccountCounter();
        this.setIdAccount();
        this.setBalance();
    }

    ////////////////// GETTERS
    public String getIdAccount() {
        return idAccount;
    }

    public double getBalance() {
        return balance;
    }

    public int getType() {
        return type;
    }


    ////////////////// SETTERS
    private void setIdAccount() {
        UUID aux_accountId;
        aux_accountId = UUID.randomUUID();
        this.idAccount = aux_accountId.toString().substring(0, 9); //I just need a 10 digits long string
    }

    /*
    public void setBalance(double balance) { //having some doubts about this method... it is thought for a bank employee to modify the limit
        this.balance = balance;
    }
*/
    private void setBalance() { //initiates balance depending on the type of bank account
        if (this.type == 1) this.balance = 15000;
        else if (this.type == 2) this.balance = 0;
        else this.balance = 30000;
    }

    public void setType(int type) {
        this.type = type;
    }


    ////////////////// OTHERS
    private static void addBankAccountCounter() {
        BankAccount.idCount++;
    }

    public double deposit(double amount) {
        this.balance += amount;

        return this.balance;
    }

    public String extract(double amount) {
        String message = "";
        if (amount > balance) {
            if (this.type != 1) message = "error";
        } else {
            this.balance -= amount;
            message = String.valueOf(this.balance);
        }
        return message;
    }

    ////////////////// OVERRIDDEN
    @Override
    public String toString() {
        return "BankAccount{" +
                "idAccount='" + idAccount + '\'' +
                ", balance=" + balance +
                ", type=" + type +
                '}';
    }
}
