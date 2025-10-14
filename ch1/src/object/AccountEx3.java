package object;

import java.util.Scanner;

public class AccountEx3 {
    public static void main(String[] args) {
        // Account account = new Account(null, null, 0);
        // Account account2 = new Account(null, null, 0);
        // Account account3 = new Account(null, null, 0);

        Scanner sc = new Scanner(System.in);

        System.out.println("생성할 계좌 수 입력");
        int num = Integer.parseInt(sc.nextLine());
        // 배열 선언

        // 배열 생성 new int[3], new Accoount[3]
        Account[] accounts = new Account[num];
        boolean run = true;
        while (run) {
            System.out.println("--------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("선택 >>");

        }

        // accounts[0] = new Account("111", "홍길동", 10000);
        // accounts[1] = new Account("222", "성춘향", 20000);
        // accounts[2] = new Account("333", "이순신", 30000);

        // print(accounts);

        // 성춘향 계좌에 입금
        // accounts[1].deposit(100000);
        // System.out.println(accounts[1].getOwner() + ":" + accounts[1].getBalance());

        print(accounts);

        for (int i = 0; i < accounts.length; i++) {

        }
        System.out.println("계좌번호 입력 :");
        String accountNo = sc.nextLine();
        System.out.println("계좌주 입력 :");
        String owner = sc.nextLine();
        System.out.println("잔액 입력 :");
        int balance = Integer.parseInt(sc.nextLine());

        accounts[1] = new Account(accountNo, owner, balance);

    }

    static void print(Account[] accounts) {
        for (Account account : accounts) {
            System.out.println("=========================");
            System.out.println("1. 계좌번호 : " + account.getAccountNo());
            System.out.println("2. 계좌주 : " + account.getOwner());
            System.out.println("3. 잔액 : " + account.getBalance());
        }
    }
}
