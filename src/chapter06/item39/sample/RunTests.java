package chapter06.item39.sample;

import chapter06.item39.annotation.ExceptionTest;
import chapter06.item39.annotation.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTests {

    public static void main(String[] args) throws ClassNotFoundException {

        int tests = 0;
        int passed = 0;

        Class<?> testClass = Class.forName("chapter06.item39.sample.Sample");

        for (Method m : testClass.getDeclaredMethods()) {

            if (m.isAnnotationPresent(Test.class)) {
                tests++;
                try {
                    m.invoke(null);
                    passed++;
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                    System.out.println(m + " 실패: " + e);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("잘못 사용한 @Test: " + m);
                }
            }
        }

        System.out.printf("성공 : %d, 실패: %d%n", passed, tests - passed);
    }
}
