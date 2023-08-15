import java.util.*;
class product{
   public static void main(String[] args)
  {
    Scanner sc =  new Scanner(System.in);
   int n1=sc.nextInt();
   int n2=sc.nextInt();
   int b=sc.nextInt();
   int product=getproduct(n1,n2,b);
   System.out.println(product);

 } public static int getproduct(int n1,int n2,int b)
{
   int rev=0;
  int p=1;
 int res2=0;
 int res=0;
   while(n2>0)
{
   int d2=n2%10;
     n2=n2/10;
   res = getsingleproduct(n1,d2,b);
    res2 = getAdd(res,rev*p,b);
   
}  
 return res2; 

}

 public static int getsingleproduct(int n1,int d2,int b)
{
   int res =0;
   int p=1;
   int c=0;
 int rev2=0;

  while(n1>0)
{
    
   int d=n1%10;
   n1=n1/10;
   res = d*d2+c;
     c= res/b;
     int rev = res%b;
     rev2+=rev*p;
   p*=10;
}
  return rev2;

}
  public static int getAdd(int n1,int n2, int b)
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
