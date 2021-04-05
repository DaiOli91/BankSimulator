package classes;

import jdk.jfr.Description;

import java.lang.annotation.Documented;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.UUID;

public class Client extends Person {
    private static int clientCounter = 0;
    private String clientId;
   // private static int length = 10;
    private HashSet<String> accountsIds; //the client may have several accounts, but I only need their Ids


    ////////////////// CONSTRUCTORS
    public Client() {
        this.clientId = "";
        this.accountsIds = new HashSet<>();
    }

    public Client(String idAccount) {
        addClientCount();
       // generateClientId();
        this.setClientId();
        this.accountsIds = new HashSet<>();
        this.accountsIds.add(idAccount);
    }

    public Client(String firstName, String lastName, String nationality, LocalDate birthDate, String idAccount) {
        super(firstName, lastName, nationality, birthDate);
        addClientCount();
        this.setClientId();
        this.accountsIds = new HashSet<>();
        this.accountsIds.add(idAccount);
    }

    ////////////////// GETTERS
    private static int getClientCounter() {
        return clientCounter;
    }

    public String getClientId() {
        return clientId;
    }

    /*
        @Deprecated
        public String getIdAccount() {
            return idAccount;
        }
    */
    ////////////////// SETTERS
    public void addIdAccount(String idAccount) {
        this.accountsIds.add(idAccount);
    }

    @Description("Generate a UUID random value and asigns it to the clientId in case the value is already taken")
    public void setClientId(){
        UUID aux_clientId;
        aux_clientId = UUID.randomUUID();
        this.clientId = aux_clientId.toString().substring(0, 9); //I just need a 10 digits long string
    }

    ////////////////// OTHERS
    private static void addClientCount() {
        clientCounter++;
    }
/*
   @Deprecated
    private void generateClientId() {
        String aux_clientId;
        StringBuilder sb = new StringBuilder();
        while (sb.length() < Client.length) {
            aux_clientId = String.valueOf(Math.random() * 57.0D + 48.0D);
            sb.append(aux_clientId);
        }
        this.clientId = sb.toString();
    }
*/
    ////////////////// OVERRIDDEN

    @Override
    public String toString() {
        return "Client{" +
                "clientId='" + clientId + '\'' +
                ", accountsIds=" + accountsIds +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return getClientId().equals(client.getClientId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClientId());
    }
}
