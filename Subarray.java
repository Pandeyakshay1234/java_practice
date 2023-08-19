import java.util.*;
import java.io.*;
public class Subarray {
    public static void main(String[] args)
    {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Scanner sc = new Scanner(System.in);
      System.out.println("enter Size of Array and array elements");
        int n = Integer.parseInt(sc.nextLine());
        int [] array =new int[n];
        for(int i =0;i<array.length;i++)
        {
            array[i]=Integer.parseInt(sc.nextLine());
            //System.out.println(array[i]);
        }
        // for(int val:array)
        // {
        //     System.out.println(val);
        // }
          
        for(int i=0; i<array.length; i++)
            {
                for(int j=i;j<array.length;j++)
                {
                    for(int k=i;k<=j;k++){
                        System.out.print(array[k]+" ");
                    }            
                    System.out.println();
                }
            }

    }
}
