import java.util.*;
import java.io.*;
public class Inverted_Barchart {
    public static void main(String[] args) {
        
      System.out.println("enter array size and elements");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int [] arr = new int[n];
       for(int i=0; i<arr.length; i++)
       {
        arr[i] = sc.nextInt();
       }
       int max=arr[0];
       for(int i=1; i<arr.length;i++ )
       {
          if(arr[i]>max)
          {
            max=arr[i];
          }
          
       }
      for(int i=1;i<=max;i++)
      {
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]>=i)
            {
                System.out.print("*\t");
            }
            else 
                 System.out.print("\t");
        }

        System.out.println();

      }    

    }
}
