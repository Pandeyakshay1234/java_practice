import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class First_Index_Occure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        
        int [] arr = new int[n];
        System.out.println("enter array element");

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        
        System.out.println("Enter data to be fetch ");
        int x = sc.nextInt();
       
        int fidx = firstindex(arr,0,x);
        System.out.println(fidx);

    }

    public static int firstindex(int [] arr , int idx ,int x)
    {
       if(idx==arr.length)
       {
        return -1;
       }
       if(arr[idx]==x)
       {
        return idx;
       }
       else
       {
        int fid = firstindex(arr , idx+1 , x);
        return  fid;
       }
    }
}
