package chapter04.item15;

class PrivateStaticOuterClass {

    private int a;

    private static class PrivateStaticInnerClass {

        public PrivateStaticInnerClass() {

            // cannot access variable a
        }
    }
}

class Main2 {
    public static void main(String[] args) {
        PrivateStaticOuterClass privateStaticOuterClass = new PrivateStaticOuterClass();

    }
}
