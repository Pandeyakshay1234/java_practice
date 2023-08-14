import java.util.*;
class Add_Base{
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
  int t=0;
  int p=1;
  int c = 0;
  while(n1>0||n2>0||c>0)
{
  int d1 = n1%10;
  int d2 = n2%10;
  
   n1=n1/10;
   n2= n2/10;
 int res = d1+d2+c;
  c=res/b;
  res=res%b;
  t+=res*p;
  p*=10;
}
   return t;

}


}