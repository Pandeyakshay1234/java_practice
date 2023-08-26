import java.util.*;

public class Ring_Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n and m and array element");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] arr = new int[n][m];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter no of shelll and rotation no");
        int s = sc.nextInt();
        int r = sc.nextInt();
        rotateShell(arr,s,r);
        display(arr);
    }
    public static void rotateShell(int[][]arr,int s,int r)
    {
       int[] onedArray = FillonedfromShell(arr,s);
        rotate(onedArray,r);
        FillShellfromoned(arr,s,onedArray);

    }
     public static int[] FillonedfromShell(int[][] arr,int s)
     {
        int minr=s-1;
        int minc=s-1;
        int maxr=arr[0].length-s;
        int maxc=arr.length-s;
        int sz= (2*maxr-2*minr)+(2*maxc-2*minc);
        int []onedArray = new int[sz];
        int idx = 0;
        //lw
        for(int i=minr,j=minc;i<=maxr;i++)
        {
             onedArray[idx] = arr[i][j];
             idx++;
        }
        //bw
        for(int i=maxr,j=minc+1;j<=maxc;j++)
        {
            onedArray[idx] = arr[i][j];
            idx++;
        }
        //rw
        for(int i=maxr-1,j=maxc;i>=minr;i--)
        {
          onedArray[idx] = arr[i][j];
          idx++;
        }
        //uw
        for(int i=minr,j=maxc-1;j>minc;j--)
        {
            onedArray[idx] = arr[i][j];
            idx++;
        }
        return onedArray;

     }
     public static void FillShellfromoned(int[][] arr,int s,int[]onedArray)
     {
        int minr=s-1;
        int minc=s-1;
        int maxr=arr[0].length-s;
        int maxc=arr.length-s;
        // int sz= (2*maxr-2*minr)+(2*maxc-2*minc);
        // int []onedArray = new int[sz];
        int idx = 0;
        //lw
        for(int i=minr,j=minc;i<=maxr;i++)
        {
             arr[i][j] = onedArray[idx];
             idx++;
        }
        //bw
        for(int i=maxr,j=minc+1;j<=maxc;j++)
        {
            arr[i][j] = onedArray[idx];
            idx++;
        }
        //rw
        for(int i=maxr-1,j=maxc;i>=minr;i--)
        {
          arr[i][j] = onedArray[idx];
          idx++;
        }
        //uw
        for(int i=minr,j=maxc-1;j>minc;j--)
        {
            arr[i][j] = onedArray[idx];
            idx++;
        }
     }
    public static void rotate(int[]onedArray,int r)
    { 
        r=r%onedArray.length;
        if(r<0)
        {
            r=r+onedArray.length;
        }
        reverse(onedArray,0,onedArray.length-r-1);
        reverse(onedArray,onedArray.length-r,onedArray.length-1);
        reverse(onedArray,0,onedArray.length-1);
    }
    public static void reverse(int [] arr , int li, int ri)
    {
      while(li<ri)
      {
        int temp = arr[li];
        arr[li]=arr[ri];
        arr[ri]=temp;
      li++;
      ri--;
      }
    }
public static void display(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

}