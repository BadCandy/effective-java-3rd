package chapter05.item26;

import java.util.*;

public class UnlimitedWildcard {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list.add(1);
        list2.add("a");
        print(list);
        print(list2);
    }

    public static void print(List<?> list) {
        list.stream().forEach(System.out::print);
        System.out.println();
    }
}
