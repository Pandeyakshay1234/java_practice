import java.util.*;
public class power{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int pow = power(x,n);
        System.out.println(pow);
    }
    public static int  power(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        int pw = power(x,n-1);
        int xn = pw*x;
        return xn;
    }
}