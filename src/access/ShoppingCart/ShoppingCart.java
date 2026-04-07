package access.ShoppingCart;

public class ShoppingCart {

    private int itemMax = 10;
    private int itemCount = 0;
    private Item items[] = new Item[itemMax];

    public void addItem(Item item) {
        if (itemCount < 10) {
            items[itemCount++] = item;
        } else {
            System.out.println("장바구니에 넣을 수 있는 최대 개수 초과");
        }
    }

    public void displayItems() {
        System.out.println("\t상품명\t단가\t\t개수\t\t가격");
        for (int i = 0; i < itemCount; i++) {
            System.out.println("\t" + items[i].getItemName()
                             + "\t\t" + items[i].getItemPrice()
                             + "\t" + items[i].getItemQuantity()
                             + "\t\t" + items[i].getItemTotalPrice());
        }
        System.out.println("총 가격: " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].getItemTotalPrice();
        }

        return totalPrice;
    }
}
