package lang;

public class StringEx5 {
    public static void main(String[] args) {
        System.out.println(count("12345AB345B", "AB"));
        System.out.println(count("12345BC", "AB"));

    }

    public static int count(String src, String target) {
        // target 이 src 내에 몇번 나오는가?
        // indexOf()
        int count = 0;
        int pos = src.indexOf(target, 0);
        System.out.println("pos" + pos);
        // target.length()
        pos = src.indexOf(target, 7);
        pos = src.indexOf(target, 10);

        while ((pos = src.indexOf(target, pos)) != -1) {
            pos = pos + target.length();
            count++;
        }

        return count;
    }
}
