package objetc;

public class GoosEx {
    public static void main(String[] args) {
        Goodstock goodstock = new Goodstock(null, 0);
        Goodstock goodsStock1 = new Goodstock();
        goodsStock1.setName("p-001");
        goodsStock1.setAmount(35);

        System.out.println(goodstock);
        System.out.println(goodsStock1);

    }
}
