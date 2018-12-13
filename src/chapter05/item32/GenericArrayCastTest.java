package chapter05.item32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericArrayCastTest {

    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        System.out.println(toList("aa").getClass());

        /**
         * ClassCastException
         */
//        System.out.println(pickTwo("aa", "bb").getClass());

        genericArrayGetType(new String[]{"bb", "aa"});

    }

    /**
     * 가변인자와 달리 타입이 유지된다.
     */
    static <T> void genericArrayGetType(T[] aa) {
        System.out.println(aa.getClass());
    }

    static <T> List<T> toList(T... args) {

        return Arrays.asList(args);
    }

    /**
     * 가변인자는 Object[] 배열로 변환이 된다. (모든 타입을 수용하기 위해서, 그리고 배열은 실체화 불가 타입)
     * 가변인자를 외부로 노출하여 클라이언트에서 이 가변인자를 사용할 경우 ClassCastException이 발생할수도 있다.
     * 그러므로 가급적이면 외부로 노출하지 말자.
     * 또한 캐스팅하여 수정용도로 사용하지 말아야한다.
     * @param args
     * @param <T>
     * @return
     */
    static <T> T[] toArray(T... args) {
        return args;
    }

    static <T> T[] pickTwo(T a, T b) {

        return toArray(a, b);
    }


}
