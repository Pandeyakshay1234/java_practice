import java.util.*;
class Prime{
             public static void main(String [] args)
{
    Scanner sc=new Scanner(System.in);
   System.out.println("enter any number to check wheather it is prime or not");
    long n = sc.nextLong();
     int count=0;
     for(int i=1;i<=n;i++)
{   
    if(n%i==0)
   count++;

}
  if(count==2)
  System.out.println(" a prime no");
  else `
      System.out.println("it is not a prime no");
  
}


}
