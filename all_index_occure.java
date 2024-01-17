import java.util.*;
    public class all_index_occure {
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
            System.out.println("enter elements to be search");
            int x = sc.nextInt();

            int [] iarr  = allindex(arr,x,0,0); 

            if(iarr.length==0)
            { 
                System.out.println();
                return;
            }
            for(int i=0;i<iarr.length;i++)
            {
                System.out.println(iarr[i]);
            }
        }
        public static int[] allindex(int [] arr , int x,int idx,int fsf)
        {
           if(idx==arr.length)
           {
            return new int[fsf];
           }
          if(arr[idx]==x)
          {
              int [] iarr = allindex(arr, x, idx+1, fsf+1);
              iarr[fsf] = idx;
              return iarr;

                    
          }
          else 
          {
            int [] iarr =  allindex(arr, x, idx+1, fsf);
            return iarr;
          }
          

        }
    }
            
            