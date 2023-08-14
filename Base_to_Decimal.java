import java.util.*;
class Base_to_Decimal
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
  System.out.println("ho");

}

  public static int convert(int n ,int b)
{
    int res =0;
    int mult=0;
    while(n>0)
{
    int rem = n%10;
     n= n/10;
    res += rem*Math.pow(b,mult);
    System.out.println(res);

     mult++;
    
}
   return res;

}


}