import java.util.*;
class Sub_Base{
   public static void main(String[] args)
  {
    Scanner sc =  new Scanner(System.in);
   int n1=sc.nextInt();
   int n2=sc.nextInt();
   int b=sc.nextInt();
   int total=getValue(n1,n2,b);
   System.out.println(total);

}
  public static int getValue(int n1,int n2, int b)
{
  int res=0;
  int p=1;
  int c = 0;
 int d;
  while(n2>0)
{
   int d1=n1%10;
   n1=n1/10;
    int d2=n2%10;
   n2=n2/10;
    d2 = d2+c;
  if(d2<d1)
{
  c=-1;
  d=d2+b-d1;
}
else 
    {
      c=0;
      d=d2-d1;
   }
 res += d*p;
 p*=10;

}
return res;
}
}