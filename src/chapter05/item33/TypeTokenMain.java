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

        // ~~~$1Super<java.util.List<java.lang.String>> 라고 나온다!!
        System.out.println(typeOfGenericSuperclass);

        // 수퍼 클래스가 ParameterizedType 이므로 ParameterizedType으로 캐스팅 가능
        // ParameterizedType의 getActualTypeArguments()으로 실제 타입 파라미터의 정보를 구한다!!
        Type actualType = ((ParameterizedType) typeOfGenericSuperclass).getActualTypeArguments()[0];

        // 심봤다! java.util.List<java.lang.String>가 나온다!!
        System.out.println(actualType);

    }

    public static void printIsParameterizedType(Type type) {
        System.out.println(type.getTypeName());
        System.out.println(type instanceof ParameterizedType);
        System.out.println();
    }
}