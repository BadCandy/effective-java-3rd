package chapter06.item39.sample_exception;

import chapter06.item39.annotation.ExceptionTest;
import chapter06.item39.annotation.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTests {

    public static void main(String[] args) throws ClassNotFoundException {

        int tests = 0;
        int passed = 0;

        Class<?> testClass = Class.forName("chapter06.item39.sample_exception.ExceptionTestSample");

        for (Method m : testClass.getDeclaredMethods()) {

            if (m.isAnnotationPresent(ExceptionTest.class)) {
                tests++;
                try {
                    m.invoke(null);
                    System.out.println(m + " 실패: 예외를 던지지 않음 ");
                } catch (InvocationTargetException e) {
                    Throwable exc = e.getCause();
                    int oldPassed = passed;
                    Class<? extends Throwable>[] excTypes = m.getAnnotation(ExceptionTest.class).value();
                    for (Class<? extends Throwable> excType : excTypes) {
                        if (excType.isInstance(exc)) {
                            passed++;
                            break;
                        }
                    }
                    if (passed == oldPassed)
                        System.out.println(m + " 실패: " + excTypes.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("잘못 사용한 @Test: " + m);
                }
            }
        }

        System.out.printf("성공 : %d, 실패: %d%n", passed, tests - passed);
    }
}
