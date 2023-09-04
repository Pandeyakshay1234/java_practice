import java.util.*;
public class gethighest_freq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        HashMap<Character,Integer> hm = new HashMap();
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
        }
        char hfc=st.charAt(0);
        for(Character key : hm.keySet())
        {
           if( hm.get(key)>hm.get(hfc))
           {
              hfc=key;
           }
        }
        System.out.println(hfc);


    }
}
