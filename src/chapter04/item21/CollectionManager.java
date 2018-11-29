package chapter04.item21;

import java.util.Collection;

/**
 * 컬렉션을 관리하기 위한 인터페이스
 */
interface CollectionManager<T extends Collection> {

    default void add(Object obj) {
        System.out.println("[Default] add method called - not thread safe!!");
        getCollection().add(obj);
    }

    /**
     * 만약 다음 release에서 addAll이라는 default 메소드가 추가되었다면?
     * 하위 클래스에서는 addAll에 대한 동작에서는 보장해주지 못함.
     * @param subCollection
     */
    default void addAll(Collection subCollection) {
        System.out.println("[Default] addAll method called - not thread safe!!");
        getCollection().addAll(subCollection);
    }

    T getCollection();
}
