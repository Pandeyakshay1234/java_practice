import java.util.HashSet;
import java.util.Iterator;

public class Hasset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);
        System.out.println("size of Hashset " + set.size());
        set.remove(1);
        System.out.println(set);
        if(!set.contains(1))
        {
            System.out.println("1 is not in the list");
        } 
      
        Iterator it = set.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
