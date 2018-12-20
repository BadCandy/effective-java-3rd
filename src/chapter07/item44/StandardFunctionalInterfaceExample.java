package chapter07.item44;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StandardFunctionalInterfaceExample {

    public static void main(String[] args) {

        Map<String, Object> map = new LinkedHashMap<>();

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(() -> {

        });
    }
}
