import java.util.*;
public class hasmap2 {
    public static void main(String[] args) {
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("India" , 110);
        hm.put("China" , 150);
        System.out.println(hm);
        System.out.println(hm.get("India"));
       System.out.println( hm.get("pakistan"));

     System.out.println(hm.containsKey("India"));
     System.out.println(hm.containsKey("Australia"));

     Set<String> keys = hm.keySet();
     System.out.println(keys);
        
     ; 
    }
}
