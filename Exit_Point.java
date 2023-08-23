import java.util.*;
public class Exit_Point {
   public static void main(String[] args) {
//  qustion ---     You are given n*m numbers (1's and 0's), representing elements of 2d array a.
//  Consider this array a maze and a player enters from top-left corner in east direction.
//  The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.
//  You are required to print the indices in (row, col) format of the point from where you exit the matrix.

   Scanner scn = new Scanner(System.in);
   int n= scn.nextInt();
   int m = scn.nextInt();
   int[][] arr = new int[n][m];
   for(int i=0; i<arr.length; i++)
   {
    for(int j=0;j<arr[0].length;j++)
    {
        arr[i][j] = scn.nextInt();
    }
   }
   int dir = 0; //0-e,1-s,2-w,3-n
   int i=0;
   int j=0;
      while(true)
      {
        dir = (dir + arr[i][j]) % 4;
        if(dir==0)
        {
            j++;
        }
        else if(dir==1)
        {
            i++;
        }
        else if (dir==2)
        {
            j--;
        }
        else if (dir==3)
        {
            i--;
        }
       
         if(i==arr.length)
         {
            i--;
            break; 
         }
         else if(j==arr[0].length)
         {
            j--;
            break;
         }
         else if(i<0)
         {
            i++;
            break;
         }
         else if(j<0)
         {
            j++;
            break;
         }
         
      }
      System.out.println(i);
      System.out.println(j);
   } 
}
