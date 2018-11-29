package chapter04.item15;

class PrivateOuterClass {

    private int a;

    private class PrivateInnerClass {

        public PrivateInnerClass() {
            // can access variable a
            a = 1;
        }
    }
}

class Main1 {
    public static void main(String[] args) {
        PrivateStaticOuterClass privateStaticOuterClass = new PrivateStaticOuterClass();

    }
}
