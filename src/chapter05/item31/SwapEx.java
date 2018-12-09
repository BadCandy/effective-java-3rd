package chapter05.item31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapEx {

    public static void swap(List<?> list, int i, int j) {
        swapHelper(list, i, j);
    }

    public static <E> void swapHelper(List<E> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
    }

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("aa");
        list.add(1);
        swap(list, 0, 1);
        System.out.println(Arrays.toString(list.toArray()));
        swapHelper(list, 0, 1);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
