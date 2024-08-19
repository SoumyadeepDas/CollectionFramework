package edu.soumyadeep.collectionessentials;
/*  >    HashMap: Think of HashMap like a traditional locker system. You have a locker (key) with some items inside
         (value). As long as the locker exists, you can open it and access your items. Even if you lose your key
         (i.e., the locker is no longer referenced elsewhere in your code), the locker is still there, with the items
         inside. It doesn’t disappear until you explicitly remove it.
	>	WeakHashMap: Now, imagine a locker system where the lockers are made of a special material that disintegrates
	    if you don’t keep a copy of the key somewhere else. If you lose the key and there’s no other copy of it, the
	    locker automatically disappears along with whatever was inside. You don’t have to worry about cleaning up; the
	    system does it for you.    */

/*	•	HashMap: Uses strong references for both keys and values. This means that as long as an entry is in the map,
        the key and value cannot be garbage collected, even if there are no other references to the key outside the map.
	•	WeakHashMap: Uses weak references for its keys. If a key in a WeakHashMap is no longer referenced elsewhere in
	    the application (i.e., no strong references exist to it), it is eligible for garbage collection. When a key is
	    collected, its entry is automatically removed from the map. */

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

class HashMapDemo {
    public static void main(String[] args) {
        Map <Key,Value> map = new HashMap<>();

        Key key1 = new Key(1);
        Key key2 = new Key(2);

        map.put(key1,new Value("Hello"));
        map.put(key2,new Value("World"));

        key1 = null;
        key2 = null;

        System.gc();

        System.out.println("HashMap = " + map);
    }
}
public class WeakHashMapDemo {
    public static void main(String[] args) {
        Map <Key,Value> map = new WeakHashMap<>();

        Key key3 = new Key(3);
        Key key4 = new Key(4);

        map.put(key3,new Value("Hello"));
        map.put(key4,new Value("World"));

        key3 = null;
        key4 = null;

        System.gc(); // starting the garbage collector.

        System.out.println("WeakHashMap = " + map);

    }
}
