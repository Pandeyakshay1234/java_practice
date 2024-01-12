import java.util.*;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
public class KLargEl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array and elements");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
     System.out.println("Enter  k  to get first k largest element");
     int k = sc.nextInt();

     for(int i = 0 ; i<arr.length;i++)
     {
        if(i<k)
        {
            pq.add(arr[i]);
        }
        else 
        {
            if(arr[i]>pq.peek())
            {
                pq.remove();
                pq.add(arr[i]);
            }
        }
     }
     while(pq.size()>0)
     {
        System.out.println(pq.peek());
        pq.remove();
     }
    }
}
