package chapter04.item19;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;

public class InheritanceTest {

    public static void main(String[] args) {

        AbstractCollection abstractCollection = new ArrayList();
        AbstractList abstractList = new AbstractList() {
            @Override
            public Object get(int index) {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }
        };
    }
}