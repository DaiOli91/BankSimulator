package classes;

import java.util.ArrayList;

public class Client extends Person{
    private static int clientCount;
    private String idClient;
    private ArrayList<String> accountsIds; //the client may have several accounts

    public Client() {
        this.idClient = addClientCount();
        this.accountsIds= new ArrayList<>();
    }
    public Client(String idClient, String idAccount) {
        this.idClient = idClient;
        this.accountsIds= new ArrayList<>();
        this.accountsIds.add(idAccount);
    }

    private static int getClientCount() {
        return clientCount;
    }
    private static String addClientCount() {
        clientCount++;
        return String.valueOf(clientCount);
    }


    public String getIdClient() {
        return idClient;
    }
/*
    public String getIdAccount() {
        return idAccount;
    }
*/
    public void addIdAccount(String idAccount) {
        this.accountsIds.add(idAccount);
    }
}
