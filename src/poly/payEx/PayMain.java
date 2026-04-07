package poly.payEx;

import java.util.Scanner;

public class PayMain {
    public static void main(String[] args) {

        PayService payService = new PayService();

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("결제 수단 입력: ");
            String payOption = scan.nextLine();
            if (payOption.equals("exit")) {
                System.out.println("프로그램 종료");
                break;
            }
            System.out.println("결제 금액 입력: ");
            int amount = scan.nextInt();
            scan.nextLine();
            payService.processPay(payOption, amount);

        }




        //naver 결제
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);

        //잘못된 결제 수단 선택
        String payOption3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOption3, amount3);
    }
}
