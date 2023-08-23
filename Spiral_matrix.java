import java.util.*;
public class Spiral_matrix {

    public static void main(String[] args) {
        System.out.println("enter n and m and elements of matrix");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m = sc.nextInt();
        int [][] mat = new int[n][m];
        for(int i =0;i<mat.length; i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                mat[i][j]= sc.nextInt();
            }
        }

        int minr = 0;
        int maxr = mat.length-1;
        int minc = 0;
        int maxc = mat[0].length-1; 
        int tcn = n*m;
        int count = 0;

      while(count<tcn)
      {
        //first row 
        for(int i=minr,j=minc;i<=maxr && count<tcn;i++)
        {
          System.out.println(mat[i][j]);
          count++;
        }
        minc++;
      //last row
       for(int i = maxr,j=minc; j<=maxc && count<tcn;j++)
       {
          System.out.println(mat[i][j]);
          count++;
       }
       maxr--;
       //last column
       for(int i=maxr,j=maxc;i>=minr && count<tcn; i--)
       {
        System.out.println(mat[i][j]);
        count++;
       }
       maxc--;
       //first row
       for(int i=minr,j=maxc; j>=minc && count<tcn;j--)
       {
        System.out.println(mat[i][j]);
        count++;
       }
      minr++;
      }

    }


}
