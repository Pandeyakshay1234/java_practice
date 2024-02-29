import java.util.ArrayList;
import java.util.Scanner;

public class Get_Keypad_Combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> rss = GKT(str);
        System.out.println(rss);

    }
     static String[] codes = {"","abc","def","ghi","mno","pqrs","tu","vwx","yz"};  
 public static ArrayList<String> GKT(String str)
 { 
    if(str.length()==0)
    {
        ArrayList<String> al = new ArrayList<>();
        al.add("");
        return al;
    }
   
    char ch = str.charAt(0);
    String rstr = str.substring(1);
    ArrayList<String> rrst = GKT(rstr);
    
    ArrayList<String> mrs = new ArrayList<>();
     String outerst = codes[ch-'0'];   
     for(int i=0;i<outerst.length();i++)
     {
        char chcode = outerst.charAt(i);
        for(String strr : rrst)
        {
           mrs.add(chcode + strr);
        }

     }
     return mrs;

    
 } 
}
