import java.util.*;
import java.io.*;
public class Lastindex_firstindex_binaryseacrh {
    public static void main(String[] args) {
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
         int left=0;
         int right = arr.length-1;
         int li=0;
         while(left<=right)
         {  int mid = (left+right)/2;
            if(data<arr[mid]){
            right=mid-1;
            }
            else if(data>arr[mid])
            {
               left=mid+1;
            }
            else 
            {   
                li=mid;
                left=mid+1;
            }
         }
         System.out.println(li);
         left=0;
          right = arr.length-1;
         int fi=0;

         while(left<=right)
         {  int mid = (left+right)/2;
            if(data<arr[mid]){
            right=mid-1;
            }
            else if(data>arr[mid])
            {
               left=mid+1;
            }
            else 
            {   
                fi=mid;
                right=mid-1;
            }
         }
         System.out.println(fi);
}
}
