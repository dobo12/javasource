package basic;

public class Variable1 {
    public static void main(String[] args) {
        // 변수 선언 후 값을 할당
        int num = 10;

        int sum = num + 20;
        System.out.println("num 변수 값" + num);
        System.out.println("sum + 10= = 20" + sum);
        System.out.printf("num 변수 값 : %d/n", num);
        // num 변수 값 : 10age=25, maxspeed=10

        int age = 25, maxspeed = 10;
        System.out.println("age= + age +,maxspeed=" + maxspeed);
        System.out.printf("abe = %d, maxspeed = %d , age, maxspeed");
        System.out.printf("abe = %10d, maxspeed = %5d/n , age, maxspeed");

        num = 35;
        // 상수 선언과 할당

        final int MAX_SPEED = 20;
        System.out.println(MAX_SPEED);
        // MAX_SPEED = 30;
    }
}
