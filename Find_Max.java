 import java.util.*;
class Find_Max{
 public static void main(String[] args)
{
  int [] arr = new int[4];
  arr[0]=5;
  arr[1]=10;
  arr[2]=40;
  arr[3]=30;
  int j=0;
  int max=arr[i];
  int temp=0;
  for(int i=0;i<4;i++)
 {
    if(arr[i]>arr[j])
      max=arr[i];
  else 
      max=arr[i];
      arr[i]=arr[j];
      arr[j]=max;
      max= arr[j];
     j++;
  }
    System.out.println(max);
}


}