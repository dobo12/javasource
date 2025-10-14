package inheritance;

// 채식동물
public class Herbiovore extends Animal {
    public Herbiovore() {
        System.out.println("Herbiovore 생성자");
    }

    @Override
    public void eat() {
        System.out.println("풀을 먹는다");
    }
}
