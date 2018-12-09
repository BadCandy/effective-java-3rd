package chapter05.item29;

/**
 * 방법 1) 배열생성시 형변환을 한다.
 * 장점 : 배열생성시 최초 1번 형변환을 해주면 된다.
 * 단점 : 런타임시 실제 배열의 타입이 Object Array이므로, 힙 오염이 발생할수 있다.
 */
public class GenericArray1<E> {

    @SuppressWarnings("unchecked")
    private E[] a = (E[]) new Object[5];

    public E get(int index) {
        return (E) a[index];
    }
}
