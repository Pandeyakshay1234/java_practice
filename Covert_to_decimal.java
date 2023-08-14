import java.util.*;

class Covert_to_decimal
{
  public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
   int n = sc.nextInt();
  int b = sc.nextInt();
     int c = convert(n,b);
     System.out.println(c);
    


}
  public static int convert(int n,int b)
{
  int p=1;
  int res=0;
 while(n>0)
{
   int rem = n%10;
   n= n/10;
   res += rem*p;
   p=p*b;
}
    return res;
  

} 

}