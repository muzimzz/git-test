package access.ShoppingCart;

public class Item {

    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return name;
    }

    public int getItemPrice() {
        return price;
    }

    public int getItemQuantity() {
        return quantity;
    }

    public int getItemTotalPrice() {
        return price * quantity;
    }
}
