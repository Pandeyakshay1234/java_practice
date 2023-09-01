import java.util.*;

public class print_permutation_string {
  public static void main(String[] args) {
  System.out.println("Enter string to print all permutstions");
  Scanner sc = new Scanner(System.in);
    String str; 
     str= sc.nextLine();
  solution(str);
   
  }
   public static void solution(String str)
   {
    int n = str.length();
    int f = fact(n);
    
    for(int i=0;i<f;i++)
    {
        StringBuilder sb = new StringBuilder(str);
        int temp = i;
        for(int j=n;j>=1;j--)
        {
           int q = temp/j;
           int r = temp%j;
           System.out.print(sb.charAt(r));
           sb.deleteCharAt(r);
           temp = q;
        }
        System.out.println();
    }

   }


   public static int fact(int n){
       int val = 1;
       for(int i=2;i<=n;i++)
       {
        val*=i;
       }
       return val;
   }


    
}
