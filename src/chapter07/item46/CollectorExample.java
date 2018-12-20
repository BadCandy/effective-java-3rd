package chapter07.item46;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class CollectorExample {

    public static void main(String[] args) {

        Map<String, Long> freq = new HashMap<>();

        freq.merge("word01", 1L, Long::sum);
        freq.merge("word01", 1L, Long::sum);
        freq.merge("word02", 1L, Long::sum);
        freq.merge("word02", 1L, Long::sum);
        freq.merge("word02", 1L, Long::sum);

        freq.entrySet().stream().forEach(System.out::println);

        List<String> words = new ArrayList<>();
        words.add("aa");
        words.add("bb");

        Map<String, List<String>> collect = words.stream().collect(groupingBy(word -> word));
        Map<String, Set<String>> collect1 = words.stream().collect(groupingBy(word -> word, toSet()));
        Map<String, Long> collect2 = words.stream().collect(groupingBy(String::toLowerCase, counting()));
        TreeMap<String, Long> collect3 = words.stream().collect(groupingBy(String::toLowerCase, TreeMap::new, counting()));

        List<String> topTen = freq.keySet().stream()
                .sorted(comparing(freq::get).reversed())
                .limit(10)
                .collect(toList());

        topTen.stream().forEach(System.out::println);
    }
}
