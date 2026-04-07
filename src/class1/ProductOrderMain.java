package class1;
import java.util.Scanner;

public class ProductOrderMain {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("입력할 주문 개수: ");
        int n = scan.nextInt(); scan.nextLine();
        Product[] products = new Product[n];

        for (int i = 0; i < products.length ; i++) {
            System.out.print( i+1 + "번째 상품명 입력: ");
            String productName = scan.nextLine();
            System.out.print( i+1 + "번째 상품 가격 입력: ");
            int price = scan.nextInt();
            scan.nextLine();
            System.out.print( i+1 + "번째 상품 개수 입력: ");
            int quantity = scan.nextInt();
            scan.nextLine();
            products[i] = createProduct(productName, price, quantity);
        }


        printProductOrder(products);
    }



    static Product createProduct(String productName, int price, int quantity) {
        Product p = new Product();
        p.productName = productName;
        p.price = price;
        p.quantity = quantity;

        return p;
    }

    static void printProductOrder(Product[] products) {
        System.out.println("상품명\t단가\t\t수량\t가격");
        int total = 0;
        for (Product p : products) {
            p.qp = p.price * p.quantity;
            total += p.qp;
            System.out.println(p.productName + "\t\t" + p.price + "\t" + p.quantity + "\t" + p.qp + "\t");
        }
        System.out.println("총 가격: " + total);
    }
}