package basic;

public class castingEx2 {
    public static void main(String[] args) {
        int i = 91234567;
        // 자동 형변환 : float f = (float)i; => 작은타입 => 큰 타입에
        float f = i;
        int i2 = (int) f;

        double d = i; // 자동 형변환
        int i3 = (int) d;
    }
    // 형병환 가능 기본타입
    // byte,short,int,long,float,double
    // char
}
