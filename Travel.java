import java.util.*;
import java.io.*;
public class Travel{

//  queston --  However, a certain visitor decides to travel a different path as follows:
// 1. The visitor only plans to visit the upper diagonal triangle of the monument list.
// 2. The visitor travels diagonally till there are no more moves left in the current journey. 
// 3. He then visits the adjacent monument to the first monument of current diagonal journey. 
// 4. He continues the same path till all the monuments of the upper half have been travelled.
// For Example:
// The monuments are named as:
// 1    2    3    4
// 5    6    7    8
// 9   10  11  12
// 13 14  15  16
// The path followed by the visitor is: 1->6->11->16->2->7->12->3->8->4
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int [n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int g=0; g<arr.length ; g++)
        {
            for(int i=0,j=g;j<arr.length;i++,j++)
            {
                System.out.println(arr[i][j]);
            }
        }
    }
}