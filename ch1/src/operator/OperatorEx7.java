package operator;

import java.util.Scanner;

public class OperatorEx7 {
    public static void main(String[] args) {
        // 키보드에서 숫자를 하나 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("25");
        int num = Integer.parseInt(sc.nextLine());

        // 입력받은 숫자가 양수, 음수인지 출력하기
        System.out.println(num > 0 ? "양수" : "음수");

        int x = 17;
        System.out.println(x < 20 && x < 20);
        int i = 9;
        System.out.println((i % 2 == 0 || i % 3 == 0) && i % 9 != 0);

    }

}
