package chapter07.item44;

import java.util.LinkedHashMap;
import java.util.Map;

public class OvrrLinkedHashMap extends LinkedHashMap {

    /**
     * 해당 조건을 만족하면, Node를 insert후에 오래된 값을 지우고 그 자리에 해당 값을 채운다.
     * @param eldest
     * @return
     */
    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > 50;
    }
}
