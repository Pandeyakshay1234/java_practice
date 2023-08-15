import java.util.*;
public class Multiply_Base{
 
     public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);
   int b = sc.nextInt();
   int n1 = sc.nextInt();
   int n2= sc.nextInt();
  int f= getmultiply(b,n1,n2);
  System.out.println(f);

}
 public static int getmultiply(int b, int n1,int n2)
{
  int res =0 ;
  int p=1;
  while(n2>0)
{
  int d = n2%10;
  n2 = n2/10;
 int gsm = getSingleDigitmulty(b,n1,d);
  res = getSum(b,res,gsm*p);
   p*=10;


}
return res;


}
public static int getSingleDigitmulty(int b,int n1,int d)
{
  int p1=1;
  int c=0;
  int r=0;
  while(n1>0|| c>0)
{
  int d2= n1%10;
  n1=n1/10;
  int res = d2*d+c;
  c=res/b;
  int rev = res%b;
 r+= rev*p1;
 p1*=10;
}
return r;
}

public static int getSum(int b, int n1, int n2) {
    int rv = 0;

    int c = 0;
    int p = 1;
    while (n1 > 0 || n2 > 0 || c > 0) {
      int d1 = n1 % 10;
      int d2 = n2 % 10;
      n1 = n1 / 10;
      n2 = n2 / 10;

      int d = d1 + d2 + c;
      c = d / b;
      d = d % b;

      rv += d * p;
      p = p * 10;
    }

    return rv;
  }
}