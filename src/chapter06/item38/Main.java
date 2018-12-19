package chapter06.item38;

import java.nio.file.LinkOption;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        double x = 11.1;
        double y = 22.2;

        test(BasicOperation.class, x, y);
        test(EnumSet.of(BasicOperation.DIVIDE, BasicOperation.MINUS), x, y);

    }

    private static <T extends Enum<T> & Operation> void test(Class<T> opEnumType, double x, double y) {
        for (Operation op : opEnumType.getEnumConstants()) {
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }
    }

    private static void test(Collection<? extends Operation> opSet, double x, double y) {
        for (Operation op : opSet) {
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }
    }
}
