import java.util.*;
class BubbleSort3{

public static int[] sort(int[]arr)
{
   for(int i=1;i<=arr.length-1;i++)
{
    for(int j = 0; j<arr.length-i;j++)

  {
    if(isSmaller(arr, j+1,j))
 {
     swap(arr,j+1,j);
  
 }

 
      
   }
}
  return arr;

}



public static boolean isSmaller(int [] arr ,int i , int j)
{
     if(arr[i]<arr[j])
{
    return true;
}
 else return false;
}


public static void Swap(int[] arr , int i,int j)
{
   int temp  = arr[i];
   arr[i] = arr[j];
   arr[j] = temp;
}

public static void  main(String [] args)
{
   System.out.println( " Enter array size and elements");
  Scanner sc  = new Scanner (System.in);
   int n =  sc.nextInt();
   int[] arr = new int[n];
   for(int i=0;i<n;i++)
  {
     arr[i] =  sc.nextInt(); 
  }
       int [] arr1 =  sort(arr);
          print(arr1);


}
}
