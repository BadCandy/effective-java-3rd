package chapter05.item33;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class TypeTokenMain {

    public static void main(String[] args) {

        class Super<T> {}

        class Sub extends Super <List<String>> {}

        Sub sub = new Sub();
        Type typeOfGenericSuperclass = sub.getClass().getGenericSuperclass();
        System.out.println(typeOfGenericSuperclass);
        Type actualType = ((ParameterizedType) typeOfGenericSuperclass).getActualTypeArguments()[0];
        System.out.println(actualType);

    }

    public static void printIsParameterizedType(Type type) {
        System.out.println(type.getTypeName());
        System.out.println(type instanceof ParameterizedType);
        System.out.println();
    }
}