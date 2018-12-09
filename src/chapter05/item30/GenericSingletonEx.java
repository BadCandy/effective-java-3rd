package chapter05.item30;

import java.util.function.UnaryOperator;

public class GenericSingletonEx {

    public static void main(String[] args) {

        String[] strings = { "삼베", "대마", "나일론" };
        UnaryOperator<String> sameString = indentityFunction();
        for (String s:
             strings) {
            System.out.println(sameString.apply(s));
        }
    }

    private static <T> UnaryOperator<T> indentityFunction() {
        return t -> t;
    }
}
