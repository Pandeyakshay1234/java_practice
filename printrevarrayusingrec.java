import java.util.*;
public class printrevarrayusingrec {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int [] arr = new int[n];
       for(int i = 0;i<arr.length;i++)
       {
        arr[i]= scn.nextInt();
       }
    
       display(arr,arr.length-1);
    }
       public static void display(int [] arr , int idx)
       {
        if(idx<0)
        {
            return;
        }
          System.out.println(arr[idx]);
          display(arr, idx-1);
       }
    }



