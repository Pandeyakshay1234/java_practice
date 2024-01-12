import java.util.*;
public class priority {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int [] marks = {2,10,11,45,14,33};
        for(int val : marks)
        {
            pq.add(val);
        }
        while(pq.size()>0)
        {
            System.out.println(pq.peek());
            pq.remove();
            System.out.println(pq);
        }
    }
}
