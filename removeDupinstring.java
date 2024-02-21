import java.util.LinkedHashSet;

public class removeDupinstring {
    
    public static void remove(String str){
        LinkedHashSet<Character> ls = new LinkedHashSet<>();
       
        for(int i=0;i<str.length();i++)
        {
            ls.add(str.charAt(i));
        }
    
        for(Character ch: ls)
        {
            System.out.println(ch);
        }
    }
    
    public static void main(String[] args) {
        
        String str = "my name is akshay pandey";
        remove(str);
    }
}

