import java.util.*;
class Fabnacci{
  public static void main(String[] args)
  {
    //Scanner sc = new Scanner(System.in);
   // System.out.println("enter range");
   // int n = sc.nextInt();
  //   int a=-1,b=1,c=0;
  //  for(int i=0 ;i<=20;i++)
  // {
  //    c=a+b;
  //    if(c<20){
    
  //    System.out.println(c);
  //    a=b;
  //    b=c;
  // }
  // }
  System.out.println("enter term");
  Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
  int a = -1,b=1,c=0;
  for(int i=0;i<=n;i++)
  {
    c = a+b;
    if(c<=n)
    {
      System.out.println(c);
    }
    a=b;
    b=c;
  }

  }

}