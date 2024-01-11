import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class Lcs {
    private static final Boolean True = null;
    private static final Boolean False = null;

    public static void main(String[] args) {
        System.out.println("eneter array size and array element");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int val : arr) {
            map.put(val, True);
        }

        for (int val : arr) {
            if (map.containsKey(val - 1)) {
                map.put(val, False);
            }
        }
        int m1 = 0;
        int msp =0;
        for(int val:arr)
        {
           if(map.get(val)==True)
           {
            int l1=1;
            int tsp=val;
            while(map.containsKey(tsp+l1))
            { 
                
               l1++;
            }
            if(l1>m1)
            {
                msp = tsp;
                m1=l1;

            }

           }
        }
        for(int i=0;i<m1;i++)
        {
            System.out.println(msp+i);
        }
    }
}
