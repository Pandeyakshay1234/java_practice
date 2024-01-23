import java.util.Scanner;


public class MergeSort {

    public static int [] Merge(int [] arr , int lo , int hi)
    {
       if(lo==hi)
       {
          int [] ba = new int[1];
          ba[0]=arr[lo];
          return ba;
       }
        int mid = (lo+hi)/2;
        int [] fhs = Merge(arr,lo, mid);
        int [] shs = Merge(arr,mid+1,hi);
        int []msa = sort(fhs, shs);
        return msa;

    }
    //merge two sorted array 
    public static int[] sort(int []a , int []b)
    {   
        print(a);
        print(b);
        int []  res = new int[a.length+b.length];
        int i =0;
        int j =0;
        int k =0;
        while(i<a.length && j<b.length)
        {
            if(a[i]<=b[j])
            {
              res[k] = a[i];
              k++;
              i++;
            }
            else
            {
                res[k] = b[j];
                k++;
                j++;
            }
        }

        while(i<a.length)
        {
            res[k]=a[i];
            k++;
            i++;
        }
       while(j<b.length)
       {
        res[k] = b[j];
        k++;
        j++;
       }
       return res ;
    }
 
    public static void print(int[] arr)
    {
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size and elements");
        int n =  sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        int [] sorted;
         sorted  = Merge(arr,0,arr.length-1);
         System.out.println("sorted array");
        print(sorted);
}   
}



