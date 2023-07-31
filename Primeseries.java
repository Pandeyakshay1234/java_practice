import java.util.*;
class Primeseries{
 public static void main(String[]args)
{
   int n1,n2;
   Scanner sc= new Scanner(System.in);
   System.out.println("enter two number");
   n1=sc.nextInt();
  n2=sc.nextInt();
int i,j;
  for(i=n1;i<=n2;i++)
   {
      for(j=2;j<=i;j++){
     if(i%j==0)
     break;
}
  if(i==j)
  System.out.println(j);
  
}
}

}