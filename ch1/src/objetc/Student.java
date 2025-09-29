package objetc;

public class Student {

    // 멤버변수
    // 이름(홍길동), 전화번호(010-1234-5678), 주소(서울시 종로구 25)
    String name;
    String tel;
    String address;

    public Student() {
    }

    // 생성자(constructor)

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
