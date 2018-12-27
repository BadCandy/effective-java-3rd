package chapter09.item58;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.removeIf(String::isEmpty);
    }
}
