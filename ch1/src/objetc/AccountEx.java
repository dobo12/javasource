package objetc;

public class AccountEx {
    public static void main(String[] args) {
        // Account 인스턴스 생성
        Account account = new Account("120-12-111", "홍길동", 100000);

        // 입금한타 호출
        account.deposit(50000);
        // 입금 후 잔액
        // System.out.println("잔액 :" + account.balance);
        System.out.println("잔액 :" + account.getBalance());

        // 출금한다 호출
        long balance = account.withdraw(70000);
        System.out.println("잔액 :" + balance);

        Account account2 = new Account("122-11-2222", "성춘향", 150000);
        // 잔액조회
        // System.out.println("성춘향 잔액 :" + account2.getBalance());
        System.out.println("=======================");
        System.out.println("계좌번호 :" + account2.getAccountNo());
        System.out.println("계좌주 :" + account2.get0wner());
        System.out.println("계좌 :" + account2.getBalance());
        System.out.println("=======================");
    }
}
