package chapter04.item22;

/**
 * 상수를 보관하는 목적으로 인터페이스를 이용하려고 했지만
 * 하위클래스에서 아래의 인터페이스를 implements 할수 있다.
 */
public interface ConstantInterface {

    String CONST_01 = "aa";
    String CONST_02 = "bb";
}
