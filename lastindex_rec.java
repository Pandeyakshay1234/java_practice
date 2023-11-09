import java.util.*;
public class lastindex_rec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter data to find in some index" + "and" +"enter array size and element");
        int d = sc.nextInt();
        int n = sc.nextInt();
       int [] arr = new int[n];
       for(int i =0;i<arr.length;i++)
       {
        arr[i] = sc.nextInt();
       }   

       int lidx = lastindex(arr , 0  , d );
       System.out.println(lidx);
    }

      public static int lastindex(int arr[] , int idx , int d){

       if(idx == arr.length)
       {
        return -1;
       }
          int lidx = lastindex(arr, idx+1, d);
          if(arr[idx] == d)
          {
            return idx;
          }
          else 
            return lidx;
    }
}
