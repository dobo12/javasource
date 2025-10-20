package lang;

public class StringEx4 {
    public static void main(String[] args) {
        String[] neams = { "Queen", "Tod", "kim", "Park", "Hong" };

        StringEx4 obj = new StringEx4();
        String result = obj.findkim(neams);

        System.out.println(result);
    }

    public String findkim(String[] names) {
        int pos = 0;
        // return : kim은 ?번째에 있다
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("kim")) {

                // i 값 보관
                // 중지
                break;
            }

        }
        return "kim은" + (pos + 1) + "번째에 있다";
    }
}
