import java.util.*;
public class Sub_Array {
    public static void main(String[] atgs)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter Array 1 size and Elements");
         int n1 = sc.nextInt();
         int[] arr1 = new int[n1];
          for(int i=0;i<arr1.length;i++)
          {
            arr1[i]=sc.nextInt();
          }
       System.out.println("enter second Array size and elements");
       int n2=sc.nextInt();
       int[] arr2=new int[n2];
       for(int i=0;i<arr2.length;i++)
          {
            arr2[i]=sc.nextInt();
          }
        int[]sub = new int[arr2.length];
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=sub.length-1;
        int c=0;

        while(k>=0)

      {
        int d=0;
        int a1v=i>=0?arr1[i]:0;
            if(arr2[j]+c>=a1v){
            d=arr2[j]+c-a1v;
       }
         else
         {
            d=arr2[j]+c+10-a1v;
            c=-1;
         }
         sub[k]=d;
         i--;
         j--;
         k--;
        }
          int idx=0;
          while(idx<sub.length)
          {
            if(sub[idx]==0){
            idx++;}
            else{
                break;
            }
          }
          while(idx<sub.length)
          {
            System.out.println(sub[idx]);
            idx++;
          }
    
        }
    }