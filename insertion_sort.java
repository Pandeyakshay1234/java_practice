import java.util.*;
public class insertion_sort {
    // private static final Boolean True = null;
    // private static final Boolean False = null;
    public static void sort(int [] arr)
    {
        for(int i = 1;i<arr.length;i++)
        {
            for(int j= i-1; j>=0;j--)
            {
                 if(isGreater(arr , j , i))
                 {
                    swap(arr,j,i);
                 }
            }
        }
    }
    public static  Boolean isGreater(int [] arr , int i , int j)
    {
      if(arr[i]>arr[j])
      {
        return true ;
      }
      else return false;
    }
    public static void  swap(int []arr,int i,int j)
    {
       System.out.println("Swapping"+arr[i]+"with"+arr[j]);
       int temp = arr[i];
       arr[i]=arr[j];
       arr[j] = temp;
    }
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
          System.out.println(arr[i]);
        }
      }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size and elements");
    
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        } 
        sort(arr);
       //System.out.println("sorted array is " + print(arr));
       print(arr);

    }

}
