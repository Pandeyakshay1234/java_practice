
import java.util.Scanner;
import java.util.*;
class fabnacci {
    public static void main(String[]arg){
   int a=-1,b=1,c=0;
   System.out.println("enter limit of series");
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   
  for(int i=1;i<=n;i++)

   {  
     c=a+b;
     a=b;
     b=c;
    if(c>20)
      break;
     System.out.println("fabnacci series" +" "+ c);
   }
   
}  
}