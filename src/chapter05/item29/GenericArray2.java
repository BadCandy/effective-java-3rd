package chapter05.item29;

/**
 * 방법 2) 배열에서 값을 꺼내올때 형변환을 해준다.
 * 장점 : 힙오염이 발생하지 않는다.
 * 단점 : 메소드마다 형변환을 해주어야한다.
 */
public class GenericArray2<E> {


    private Object[] a =  new Object[5];

    public E get(int index) {
        @SuppressWarnings("unchecked")
        E element = (E) a[index];
        return element;
    }
}
