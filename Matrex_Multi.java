import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import java.io.*;
public class Matrex_Multi {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        System.out.println("enter row and column for first matrix and give elements");
        int r1=scn.nextInt();
        int c1=scn.nextInt();
        int [][] one = new int[r1][c1];
        for(int i=0;i<one.length;i++)
        {
            for(int j=0;j<one[0].length;j++){
            one[i][j] = scn.nextInt();
            }
        }
     System.out.println("enter row and column for second matrix and give elements");
     int r2 = scn.nextInt();
     int c2 = scn.nextInt();
     int [][]two = new int[r2][c2]; 
     for(int i=0;i<two.length;i++)
        {
            for(int j=0;j<two[0].length;j++)
            {
                two[i][j] = scn.nextInt();
            }
        }
        if(c1!=r2)
        {
            System.out.println("invalid input");
            return;
        }
        
        int[][] prod = new int[r1][c2];
        for(int i=0;i<prod.length;i++)
        {
            for(int j=0;j<prod[0].length;j++)
         {
            for(int k=0;k<c1;k++)
            {
                 prod[i][j] += one[i][k]*two[k][j]; 
            }
         }
            
        }
        for(int i =0;i<prod.length;i++)
        {
            for(int j=0;j<prod[0].length;j++)
            {
                System.out.print(prod[i][j] + "\t");
            }
           System.out.println();
        }
        


    }
}
