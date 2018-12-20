package chapter07.item47;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class Main {

    public static void main(String[] args) {

        Set<String> set = Stream.iterate('A', input -> (char) (input + 1)).limit(0)
                .map(String::valueOf)
                .collect(toSet());

        Collection<Set<String>> subSet = PowerSet.of(set);
        subSet.stream().forEach(System.out::println);

        System.out.println("===========================================================================");
        List<String> list = Stream.iterate('A', input -> (char) (input + 1)).limit(3)
                .map(String::valueOf)
                .collect(toList());

        Stream<List<String>> subLists = SubLists.of(list);
        subLists.forEach(System.out::println);
    }
}
