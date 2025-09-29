package objetc;

public class MymathEx {
    public static void main(String[] args) {
        // MyMath 인스턴스 생성
        Mymath mymath = new Mymath();

        // 메소드 호출
        // 1) 변수애 받기
        // 2) 출력문
        long result = mymath.add(12, 63);
        System.out.println("덧샘결과" + result);

        result = mymath.subtract(85, 35);
        System.out.println("뺄셈결과 :" + result);

        result = mymath.multiply(5, 85);
        System.out.println("곱셈결과 :" + result);

        double result2 = mymath.dibide(8, 3);
        System.out.println("나눗셈결과 :" + result2);

    }
}
