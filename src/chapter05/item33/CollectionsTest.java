package chapter05.item33;

import java.util.Collections;
import java.util.HashSet;

public class CollectionsTest {

    public static void main(String[] args) {

        Collections.checkedSet(new HashSet<String>(), String.class);
    }
}
