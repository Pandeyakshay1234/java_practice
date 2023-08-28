import java.util.*;
public class Toggle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       String s = sc.nextLine();
       System.out.println(Toggle(s));
    }
    public static String Toggle(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<s.length();i++)
        {
            char ch = sb.charAt(i);
            if(ch>='a' && ch<='z')
            {
                char upr = (char)('A'+ch-'a');
                sb.setCharAt(i,upr);
            }
            else if(ch>='A' && ch<='Z')
            {
                char lw = (char)('a' + ch-'A');
                sb.setCharAt(i,lw);
            }
        }
        return  sb.toString();
    }

}
