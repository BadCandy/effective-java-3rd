package chapter07.item43;

import java.util.HashMap;
import java.util.Map;

public class MethodReference {

    private static Map<String, Integer> map = new HashMap<>();


    public static void main(String[] args) {

        String key = "key";

        /**
         * 람다 표현식 전달
         */
        map.merge(key, 1, (count, increment) -> count + increment);

        /**
         * 메소드 참조 전달
         * 코드가 더욱 깔끔해진다.
         */
        map.merge(key, 1, Integer::sum);

        System.out.println(map.get(key));
    }
}

interface A {

}

interface B {

}

interface C extends A, B {

}