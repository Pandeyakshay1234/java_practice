import java.util.*;
public class Anagram {

  public  static boolean anagram (String a , String b)
  {

    if(a.length()!=b.length())
    {
        return false;
    }
    char str1[]= a.toCharArray();
       char str2[]= b.toCharArray();
       Arrays.sort(str1);
       Arrays.sort(str2);
    for(int i = 0;i<a.length();i++)
    {
        
        if(str1[i]!=str2[i])
        {
            return false;
        }
    }
    return true;

  }


    public static void main(String[] args) {
        System.out.println("enter stirng to check");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(anagram(s1,s2))
            System.out.println("stirngs are Anagram");
        else 
         System.out.println("Strings are not Anagram");

    }
}
