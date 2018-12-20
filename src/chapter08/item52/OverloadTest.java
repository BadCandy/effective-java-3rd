package chapter08.item52;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OverloadTest {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

//        executorService.submit(System.out::println);

        executorService.submit(() -> {
            System.out.println("aa");
            return "aa";
        });

        executorService.submit(() -> {
            System.out.println("aa");
        });
    }
}
