import java.util.*;
class Prime_till_n {

     public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
   System.out.println("enter num1"); 
    int n1= sc.nextInt();
    System.out.println("enter num2");
   int n2 = sc.nextInt();

   int count =0;
    int i ,j;
  for(i=n1; i<=n2;i++)
    {
        for( j=2;j<=i-1;j++)
     { if(i%j==0)
        {count++;}
}
    if(count==0)
    System.out.println(j);
    else 
     count=0;

}

} 

}