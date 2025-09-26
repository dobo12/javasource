package array;

public class ArrayEx4 {
    private static int min;

    public static void main(String[] args) {
        int[] score = { 79, 88, 91, 33, 100, 55, 95 };

        // 최대값과 최소값 출력
        int max = score[0];
        int mun = score[0];

        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            } else if (score[i] < min) {
                min = score[1];
            }
        }

    }
}
