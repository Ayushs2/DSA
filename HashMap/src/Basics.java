import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Basics {
    /*
    It is an Efficient way to store and find item (Generating Key Value pair)

    "syntax to declare and initialize HashMap" --> HashMap <Key, value> hm  = new HashMap <Key, value>();
    Key is basically stores the index and value is the value corresponding to that index.
    hm is object or reference variable of class Hashmap.
   Functions in HashMap
   1) hm.put(key,value) -> it is used to put key value pair in map and if key is already present in map it will update
   the value of that key.
   2) hm.get(key) -> It returns the value of provided key and if key is not there it returns null.
   3) hm.isEmpty() -> It returns true if hashmap is empty i.e. it does not have any key value pair in it.
   4) hm.size() -> It return the count of pairs in the map.
   5) hm.containsKey(key) -> it returns true if key is present else return false
   6) hm.remove(key) -> removes key value pair from the map.
   7) hm.keySet() -> returns set(arrays) of keys.
   8) hm.values() -> returns a Collection view of the values contained in this map.
   9) hm.entrySet() -> returns a complete set of keys and values present in the HashMap.
                        Syntax:
                        public Set<Map.Entry> entrySet()
   10) hm.getOrDefault() -> method returns a default value if there is no value
                            find using the key we passed as an argument in HashMap.
     */
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("hey",10);
        hm.put("new", 12);
        for(String s: hm.keySet()){
            System.out.println(s+ " " +hm.get(s));
        }// 7)
//        System.out.println(hm.keySet());
//        Set<String> Geekskeys = hm.keySet();
//        System.out.println("Initial keys  : " + Geekskeys );
//        //8)
//        Collection<Integer> i = hm.values();
//        System.out.println(i);
//        System.out.println(hm.values());
    }
}
