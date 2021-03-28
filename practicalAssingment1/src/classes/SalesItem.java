package classes;

public class SalesItem {
    private static int codeCount;
    private String itemCode;
    private String itemId; //name
    private String description;
    private int quantity;
    private float unitPrice;

    public SalesItem(String itemId, String description, int quantity, float unitPrice) {
        this.itemCode =
        this.itemId = itemId;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }


    private static String addCodeCount() {
        SalesItem.codeCount++;
        return String.valueOf(SalesItem.codeCount);
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public float calculatePrice(){
        return this.unitPrice*this.quantity;
    }

    @Override
    public String toString() {
        return "SalesItem{" +
                "itemCode='" + itemCode + '\'' +
                ", itemId='" + itemId + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
