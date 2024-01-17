import java.util.*;
public class Last_index_occurance {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size and elements");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter number to search index for");
        int x =sc.nextInt();
        int li = Lastindex(arr,0,x);
        System.out.println("last index for that elements is:" + li);
    }
    public static int Lastindex(int[]arr,int idx,int x )
    {
        if(idx==arr.length)
        {
            return -1;
        }
        int liisa = Lastindex(arr,idx+1,x);
        if(liisa == -1)
        {
            if(arr[idx]==x)
            {
                return idx;
            }
            else return -1;
        }

       else 
       return liisa; 
    }
   }

