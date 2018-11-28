package chapter04.item15.b;

import chapter04.item15.a.PublicAccessClass;

public class AccessToClassTest {

    public static void main(String[] args) {

        // 접근 가능
        PublicAccessClass publicAccessClass = new PublicAccessClass();

        // 접근 불가능
//        DefaultAccessClass defaultAccessClass = new DefaultAccessClass();
    }
}
