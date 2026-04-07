package oop;
import java.util.Scanner;

public class RectangleOopMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Rectangle r = new Rectangle();

        System.out.print("가로 길이 입력: ");
        r.width = scan.nextInt(); scan.nextLine();
        System.out.print("세로 길이 입력: ");
        r.height = scan.nextInt(); scan.nextLine();

        int area = r.calculateArea();
        System.out.println("넓이: " + area);

        int perimeter = r.calculatePerimeter();
        System.out.println("둘레: " + perimeter);

        boolean isSquare = r.isSquare();
        System.out.println("정사각형인가?: " + isSquare);
    }
}
