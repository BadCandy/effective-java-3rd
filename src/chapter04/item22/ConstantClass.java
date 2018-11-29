package chapter04.item22;

/**
 * 상수 전용 클래스는 다른 목적으로 사용하지 못하도록
 * 생성자를 private으로 둔다.
 */
public class ConstantClass {

    public static final String CONST_01 = "aa";
    public static final String CONST_02 = "bb";

    private ConstantClass() {

    }
}
