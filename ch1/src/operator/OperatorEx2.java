package operator;

public class OperatorEx2 {
    public static void main(String[] args) {
        // + - * / %

        int a = 10, b = 4;
        System.out.printf("%d + %d = %d/n", a, b, a + b);
        System.out.printf("%d - %d = %d/n", a, b, a + b);
        System.out.printf("%d * %d = %d/n", a, b, a + b); // 2
        System.out.printf("%d / %d = %d/n", a, (float) b, a / (float) b); // 2

        // 서로 다른 타입의 연산결과는 큰 타입 따라감
        // int/int => int
        // int/float => float
        // int/double => double

    }
}
