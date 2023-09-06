import java.util.*;
import java.math.*;
public class Power_Logarithmic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int  pow = power(x,n);
        System.out.println(pow);
    }
    public static int  power(int x,int n)
    {
        if(n==0){
            return 1;
        }
      int pbn2= power(x,n/2);
      int  pw = pbn2*pbn2;
      //System.out.println(pw);
      if(n%2==1)
      {
        pw=pw*x;
       // System.out.println(pw);
      }

      return pw;
    }
}
