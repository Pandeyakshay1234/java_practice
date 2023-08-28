import java.util.*;

import org.omg.Messaging.SyncScopeHelper;
public class Ascii_Diff_char {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(DiffString(str));
    }

  public static String DiffString(String str)
  {
    StringBuilder sb = new StringBuilder();
    sb.append(str.charAt(0));
    for(int i=1;i<str.length();i++)
    {
        char curr = str.charAt(i);
        char pre = str.charAt(i-1);
        int diff = curr-pre;
        sb.append(diff);
        sb.append(curr);
    }
    return sb.toString();
  }
}
