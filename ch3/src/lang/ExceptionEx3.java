package lang;

public class ExceptionEx3 {
    public static void main(String[] args) {
        // 1. nullpointerException
        String str = null;
        Value v = null;
        // int i = null;
        System.out.println(str);
        // if (str ! = null) {
        // System.out.println(str.length()); // NullpointerException
        // }

        // 2.ArrayindexOutOfBoundsException
        if (args.length == 1) {
            String data1 = args[0];
            System.out.println(data1);

        }

        // 3. NumberFormatException

        try {
            // exception 발생할 가능성이 있는 코드
            String data2 = args[0];
            String data1 = "a100";
            int Value1 = Integer.parseInt(data1);
            System.out.println(Value1);
        } catch (NumberFormatException e) {
            // exception 발생하면 해야 하는 작업
            // e.printStackTrace();// 추적
            // System.out.println(e.getMessage()); // For input string: "a100"
            System.out.println("입력값 확인");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인자 확인");
        }

        // 4. ClassCastException
        Dog dog = new Dog();
        changDog(dog);
        Cat cat = new Cat();
        changDog(cat);

    }

    public static void changDog(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
        }
    }
}
