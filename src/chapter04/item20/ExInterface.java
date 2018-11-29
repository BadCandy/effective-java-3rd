package chapter04.item20;

public interface ExInterface {

    default void hi() {
        System.out.println("hi");
    }

    default void hello() {
        System.out.println();
    }
}
