package inheritance;
// 다형성(polymorphism)      

// 여러가지 형태를 가질 수 있는 능력
// 부모 = new 자식()
// ----
// print(자식)
// void print(부모){};

public class AnimalEx {
    public static void main(String[] args) {
        // 인스턴스 생성
        // Animal animal = new Animal();

        Carnivore carnivore = new Carnivore();
        carnivore.eat(); // 고기를~~
        carnivore.print();

        // Herbiovore herbiovore = new Herbiovore();
        // herbiovore.eat(); // 채소를~~

        Animal animal = new Carnivore();
        animal.eat();
        // animal.print();

        // animal = new Herbiovore();
        // animal.eat();
    }
}
