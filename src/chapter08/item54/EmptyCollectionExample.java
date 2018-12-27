package chapter08.item54;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmptyCollectionExample {

    private static final List<String> list = new ArrayList<>();
    private static final String[] EMPTY_STRING_ARRAY = new String[0];

    public static void main(String[] args) {
        getList();
    }

    public static List<String> getList() {

        List<String> list = Collections.emptyList();
        return list;
    }

    public String[] getStringArray() {

        return list.toArray(EMPTY_STRING_ARRAY);
    }
}
