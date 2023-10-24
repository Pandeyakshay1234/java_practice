import java.util.*;
public class StirngPalindrom {
    public static void main(String[] args) {
        System.out.println("enter string to check");
        Scanner sc= new Scanner(System.in);
        String  str = sc.nextLine();
        String rev = "";
        for(int i=str.length()-1;i>=0;i--)
       {
         rev = rev+str.charAt(i);
       }
     
     if(str.equals(rev))
     System.out.println("String is palindrom");
     else 
     System.out.println("String is not palindrom");
    }
}
