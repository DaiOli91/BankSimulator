package classes;

public class BankAccount {
    private static int idCount = 0;
    private String idAccount;
    private double balance;
    private int type; //as in 1 for Current Account, 2 for Salary Account and 3 for Fixed Deposit Account

    public BankAccount() {
        setIdAccount();
        this.balance = 0;
        this.type = 2;
    }
    public BankAccount(int type) {
        setIdAccount();
        setBalance();
    }

    public String getIdAccount() {
        return idAccount;
    }

    private void setIdAccount() {
        idCount++;
        this.idAccount = String.valueOf(idCount);
    }

    public double getBalance() {
        return balance;
    }
/*
    public void setBalance(double balance) { //having some doubts about this method... it is thought for a bank employee to modify the limit
        this.balance = balance;
    }
*/
    private void setBalance() { //initiates balance depending on the type of bank account
        if(this.type == 1) this.balance = 15000;
        else if (this.type == 2) this.balance = 0;
        else this.balance = 30000;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double deposit(double amount){
        this.balance += amount;

        return this.balance;
    }

    public String extract(double amount){
        String message = new String();
        if (amount > balance){
            if (this.type != 1) message = "error";
        } else {
            this.balance -= amount;
            message = String.valueOf(this.balance);
        }
        return message;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "idAccount='" + idAccount + '\'' +
                ", balance=" + balance +
                ", type=" + type +
                '}';
    }
}
