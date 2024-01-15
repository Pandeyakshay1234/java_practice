import java.util.*;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class nearly_Sorted_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size and elements");
        int n  = sc.nextInt();
        int [] arr =  new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter max displaced k in an sorted array");
        int k = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0;i<=k;i++)
        {
            pq.add(arr[i]);
            
        }
        
        for( int i=k+1;i<arr.length;i++)
        {
            System.out.println(pq.remove());
            pq.add(arr[i]);
        }
        while(pq.size()>0)
        {
            System.out.println(pq.remove());
        }
    
    }
}
