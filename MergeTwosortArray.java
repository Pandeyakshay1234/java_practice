import java.util.Scanner;


public class MergeTwosortArray {
    //merge two sorted array 
    public static int[] sort(int []a , int []b)
    {  int []  res = new int[a.length+b.length];
        int i =0;
        int j =0;
        int k =0;
        while(i<a.length && j<b.length)
        {
            if(a[i]<b[j])
            {
              res[k] = a[i];
              k++;
              i++;
            }
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
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first array size and elements");
        int n = sc.nextInt();
        int []  a = new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("enter second array size and elements");
    int m = sc.nextInt();
    int [] b = new int[m];
    for(int i=0;i<b.length;i++)
    {
        b[i] = sc.nextInt();
    }

    int [] mergearray =  sort(a, b);
    print(mergearray);
}
}



