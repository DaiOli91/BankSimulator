package classes;


import java.time.LocalDateTime;
import java.util.UUID;

public class Transaction {
    private LocalDateTime date;
    private String transactionId; // Idk if this is necessary, but it's usually present in bank registers
    private String description;
    private double amount;

    ////////////////// CONSTRUCTORS

    public Transaction() {
    }

    ////////////////// GETTERS
    ////////////////// SETTERS
    private void setTranstactionId() {
        UUID aux_transactionId;
        aux_transactionId = UUID.randomUUID();
        this.transactionId = aux_transactionId.toString().substring(0, 9); //I just need a 10 digits long string
    }
    ////////////////// OTHERS
    ////////////////// OVERRIDDEN
}
