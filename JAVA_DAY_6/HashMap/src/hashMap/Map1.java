package hashMap;

import java.util.HashMap;
import java.util.Set;

public class Map1 {
    public static void main(String[] args) {
        HashMap<Integer,String> h=new HashMap<Integer,String>();
        h.put(1,"hit");
        h.put(2,"esh");
        h.put(3,"dolu");
        System.out.println(h);
        h.put(3,"tim");
        System.out.println(h);
        System.out.println(h.get(1));
        System.out.println(h.containsKey(1));
        System.out.println(h.containsValue("hit"));
//        System.out.println(h.isEmpty());h.clear();
//        System.out.println(h.isEmpty());
        Set<Integer> s=h.keySet();
        for (int key:s){
            System.out.println(key+"--->"+h.get(key));
        }
    }





}
