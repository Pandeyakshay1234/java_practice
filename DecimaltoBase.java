import java.util.*;
class DecimaltoBase
{
  public static void main(String[] args)
{
  Scanner scn = new Scanner(System.in);
  System.out.println("enter n");
  int n = scn.nextInt();
  System.out.println("enter base");
  int b = scn.nextInt();
  int finalno = convert(n,b);
  System.out.println(finalno);
}

  public static int convert(int n ,int b)
{
    int p=1; int res =0;
    while(n>0)
{
    int rem = n%b;
     n= n/b;
    res += rem*p;
    p*=10;
}
   return res;

}


}