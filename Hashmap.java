import java.util.*;

import javafx.scene.web.WebHistory.Entry;
public class Hashmap {
 public static void main(String[] args) {
    HashMap<String,Integer> map = new HashMap<>();
    map.put("China",120);
    map.put("India", 125);
    map.put("US",35);
    System.out.println(map.get("China"));
   if (map.containsKey("China"))
   {
    System.out.println("key exits");
   }
   else
   System.out.println("key doesnot exits");
    System.out.println(map);
    map.remove("China");
   for(Map.Entry<String,Integer> e : map.entrySet())
   {
       System.out.println(e.getKey());
       System.out.println(e.getValue());
   }

 }   
}
