import java.util.*;
import java.io.*;
public class ceil_floor {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array and elemens");
        int n =  sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter data for search");
        int data = sc.nextInt();
         int lo=0;
         int hi= arr.length-1;
         int ceil=0;
         int floor=0;
         while(lo<=hi)
         {
            int mid=(lo+hi)/2;
            if(data<arr[mid])
            {
                hi=mid-1;
                ceil=arr[mid];
            }
            else if(data>arr[mid])
            {
                lo=mid+1;
                floor = arr[mid];
            }
            else
            {
                ceil=arr[mid];
                floor=arr[mid];
                break;
            }
         }
            System.out.println( ceil);
            System.out.println(floor);
    }
}
