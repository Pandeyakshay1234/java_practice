import java.util.*;
public class Substring_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solution(str); 
    }
      public static boolean isPalindrom(String s)
      {
         int i=0;
         int j=s.length()-1;
         char c1 =s.charAt(i);
         char c2 =s.charAt(j);
         while(i<=j)
         {
            if(c1!=c2)
            {
                return false;
            }
            else
            {
                i++;
                j--;
            }
         }
         return true;
      }
    public static void solution(String s)
    {
       for(int i=0;i<s.length();i++)
       {
          for(int j=i+1;j<=s.length();j++)
          {
            String s1= s.substring(i, j);
          if(isPalindrom(s1)==true)
          {
            System.out.println(s1);
          }
          }
       }
    }


}
