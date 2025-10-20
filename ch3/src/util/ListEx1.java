package util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        // String[] str1 = { "" };
        List<String> list1 = new ArrayList<>();
        // 추가 add => append
        list1.add("사과");
        list1.add("포도");
        list1.add("귤");
        list1.add("키위");
        list1.add("멜론");
        list1.add("수박");
        list1.add("감");

        System.out.println(list1);// [사과, 포도, 귤, 키위, 멜론, 수박, 감]
        System.out.println(list1.get(3));// 키위

        System.out.println("리스트 요수 개수" + list1.size());
        // remove
        list1.remove(0);
        System.out.println(list1);
        list1.remove("수박");
        System.out.println(list1);
        // (중간)삽입
        list1.add(2, "딸기");
        System.out.println(list1);

        for (String string : list1) {
            System.out.println(string);
        }

        list1.sort(Comparator.reverseOrder());
        System.out.println(list1);
    }
}
