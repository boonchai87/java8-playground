package nengboonchai.util;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestMap {
    public static void main(String[] args) {
        Map mp = new HashMap<String,String>();
        ConcurrentHashMap chm= new ConcurrentHashMap<String,String>();
        chm.put("d","ddd");
        System.out.println(chm);

    }
}
