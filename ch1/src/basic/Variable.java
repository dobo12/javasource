package basic;

public class Variable {
    public static void main(String[] args) {

        float scorel = 50.15F;
        double score2 = 45.129F;
        System.out.println("scorel = " + scorel);
        // 50.0
        // System.out.println("score2 = " + score2); // 45.0
        // double : d D
        // %10.2f : %전체자릿수 . 소수점자릿수
        System.out.printf("score1 = %.2f, score2 = %f/n", scorel, score2);
        System.out.printf("score1 = %10.2f, score2 = %f/n", scorel, score2);

    }

}
