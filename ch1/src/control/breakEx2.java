package control;

import java.util.Scanner;

public class breakEx2 {
    public static void main(String[] args) {
        // 메뉴를 보여 준 후 메뉴를 선택
        // 메뉴번호가 1~3 사이인데 다른 번호를 입력하면 다시 메뉴를 보여주기
        // 메뉴번호가 0번이면 프로그램을 종료
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("(1)squre");
            System.out.println("(2)squre root");
            System.out.println("(3)LOG");
            System.out.println("(1)원하는 메뉴 1~3에서 선택하세요 종료 : 0");

            int menu = Integer.parseInt(sc.nextLine());

            if (menu == 0) {
                System.out.println("프로그램 종료");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴를 잘못 선택하셨습니다");
                continue;
            }

            System.out.println("선택한 메뉴는 " + menu + "입니다");
        }
    }
}
