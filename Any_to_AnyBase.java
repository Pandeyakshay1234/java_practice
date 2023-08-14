import java.util.*;
class Any_to_AnyBase{
  public static void main(String[]args)
{
   Scanner sc= new Scanner(System.in);
   int n= sc.nextInt();
  int b1= sc.nextInt();
   int b2= sc.nextInt();
  int c = getvalue(n,b1,b2);
   System.out.println(c); 
}

public static int getvalue(int n,int b1,int b2)
{ 
  int dec = AnytoDecimal(n,b1);
  int value = DecimaltoAny(dec,b2);
  return value;
 
}
public static int AnytoDecimal(int n,int b1)
{
   int p=1;
   int res=0;
   while(n>0)
{
   int rem=n%10;
    n=n/10;
   res += rem*p;
   p=p*b1;
}
 return res;
}

public static int DecimaltoAny(int dec,int b2)
{
    int p=1;
    int res=0;
    while(dec>0)
{
     int rem = dec%b2;
     dec = dec/b2;
     res += rem*p;
     p*=10;   
} 
   return res;
}

}