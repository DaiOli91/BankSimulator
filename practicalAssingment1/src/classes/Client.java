package classes;

import java.util.ArrayList;

public class Client extends Person{
    private static int clientCount = 0;
    private String clientId;
    private ArrayList<String> accountsIds; //the client may have several accounts

    public Client() {
        this.clientId = addClientCount();
        this.accountsIds= new ArrayList<>();
    }
    public Client(String clientId, String idAccount) {
        this.clientId = clientId;
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


    public String getClientId() {
        return clientId;
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
