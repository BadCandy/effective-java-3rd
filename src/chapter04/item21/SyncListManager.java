package chapter04.item21;

import java.util.List;

/**
 * 스레드 동기화 기능을 지원하는 CollectionManager
 */
class SyncListManager implements CollectionManager<List> {

    private Object lock = new Object();

    private List list;

    public SyncListManager(List list) {
        this.list = list;
    }

    @Override
    public List getCollection() {
        return list;
    }

    @Override
    public void add(Object obj) {
        System.out.println("[Override] add method called - thread safe!!");
        synchronized (lock) {
            getCollection().add(obj);
        }
    }
}
