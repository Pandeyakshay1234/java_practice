import java.util.*;
public class compression_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }
    public static String  compression2(String str)
    {
        String s1=str.charAt(0) + "";
        int count=1;
       for(int i=1;i<str.length();i++)
       {
           char curr = str.charAt(i);
           char  pre = str.charAt(i-1);
        if(curr==pre)
        {
            count++;
        }
        else
        {
          if(count>1)
          {
            s1+=count;
            count=1;
          }
          s1+=curr;
        }
       }
       if(count>1)
       {
        s1+=count;
       }
        return s1;
    }
    public static String compression1(String str)
    {
        String s1=str.charAt(0) + "";
       for(int i=1;i<str.length();i++)
       {
           char curr = str.charAt(i);
           char pre = str.charAt(i-1);
           if(pre!=curr)
           {
            s1+=curr;
           }     
       }     
       return s1;
    }
}
