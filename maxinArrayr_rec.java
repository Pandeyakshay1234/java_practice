import java.util.*;

public class maxinArrayr_rec{
    public static void main(String[] args) {
        System.out.println("enter size of Array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.println("enter elements of an array");
        int []arr = new int[n];
       System.out.println("enter elements of an array");
       for(int i=0;i<arr.length;i++)
       {
        arr[i] = sc.nextInt();
       }
      int max = maxOfArray(arr,0);
       System.out.println(max);
    }
    public static int maxOfArray(int[]arr ,int idx)
    {
        if(idx==arr.length-1)
        {
            return arr[idx];
        }
        int misa = maxOfArray(arr,idx+1);
        if(misa>arr[idx])
        {
            return misa;
        }
        else 
        return arr[idx];
    }
    
}