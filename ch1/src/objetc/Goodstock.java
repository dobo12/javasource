package objetc;

public class Goodstock {
    // 속성 : 상품명(p0001), 수량(10)
    String name;
    int amount;

    public Goodstock(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public Goodstock() {
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    // 기본생성자

    // setter, grtter 메소드
    // 이름 변경 메소드 생성
    // 리턴타입 메소드명(메개변수1, 메개변수2,......){}
    // void + 기본타입-int,float,double.... , 참조타입-String, []
    void changeName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Goodstock [name=" + name + ", amount=" + amount + "]";
    }

}
