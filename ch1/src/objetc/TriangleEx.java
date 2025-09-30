package objetc;

public class TriangleEx {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(12, 6);

        // 속성(멤버변수) 초기화
        // 1. 직접접근(속성)
        // triangle.baseLine = 12;
        // triangle.height = 6;

        // 2. 생성자
        Triangle triangle1 = new Triangle(12, 6);
        System.out.println("넓이 :" + triangle.getArea());

        // 3. setter 메소드
        Triangle triangle2 = new Triangle();
        triangle2.setBaseLine(10);
        triangle2.setHeight(5);
        System.out.println("넓이 :" + triangle2.getArea());

    }
}
