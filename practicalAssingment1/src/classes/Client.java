package classes;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public class Client extends Person{
    private static int clientCounter = 0;
    private String clientId;
    private static int length = 10;
    private HashSet<String> accountsIds; //the client may have several accounts, but I only need their Ids


    public Client() {
        addClientCount();
        generateClientId();
        this.accountsIds= new HashSet<>();
    }

    public Client(String idAccount) {
        addClientCount();
        generateClientId();
        this.accountsIds= new HashSet<>();
        this.accountsIds.add(idAccount);
    }

    public Client(String idNumber, String firstName, String lastName, String nationality, Date birthDate) {
        super(idNumber, firstName, lastName, nationality, birthDate);
    }

    private static int getClientCounter() {
        return clientCounter;
    }

    private static void addClientCount() {
        clientCounter++;
    }


    public String getClientId() {
        return clientId;
    }
/*
    public String getIdAccount() {
        return idAccount;
    }
*/
   private void generateClientId() {
        String aux_clientId;
        StringBuilder sb = new StringBuilder();
        while(this.clientId.length() < Client.length) {
            aux_clientId = String.valueOf(Math.random() * 57.0D + 48.0D);
            sb.append(aux_clientId);
        }
        this.clientId = sb.toString();
    }

    public void addIdAccount(String idAccount) {
        this.accountsIds.add(idAccount);
    }
}
