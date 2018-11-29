package chapter04.item21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CollectionManager<List> manager = new SyncListManager(new ArrayList());

        manager.add("a");
        manager.addAll(Arrays.asList("b", "c"));
    }
}
