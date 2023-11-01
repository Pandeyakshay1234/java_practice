import java.util.*;
public class highest_fre_hm {
    public static void main(String[] args) {
        System.out.println("enter string to find frequency of an character");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<st.length();i++)
        {
            char ch = st.charAt(i);
            if(hm.containsKey(ch))
            {
                int of = hm.get(ch);
                int nf = of+1;
                hm.put(ch,nf);
            }
            else
            {
                hm.put(ch,1);
            }
            // int maxf = hm.get(st.charAt(0));
        }
        // char maxf = st.charAt(0);
         char  maxf = st.charAt(0);
        for(Character key: hm.keySet())
        {
            if(hm.get(key)>hm.get(maxf))
            {
               maxf = key;
            }
        }
        System.out.println("highest freq is" + "" + maxf);
    }
}
