import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        for (int i = 0; i < count; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int total = 1;
            for(int j = 0; j < b; j++) {
                total = (total * a) % 10;
            }
            int answer = total % 10;
            if (answer == 0)
                answer = 10;
            System.out.println(answer);
        }
    }
}