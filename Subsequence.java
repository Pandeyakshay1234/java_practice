import java.util.*;
   public class Subsequence
{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str  = scn.nextLine();
    ArrayList<String> reList = gss(str);
     System.out.println(reList);

  }

public static ArrayList<String> gss(String str) {
 
    if(str.length()==0)
    {
      ArrayList<String> rss = new ArrayList<>();
      rss.add("");
      return rss;
    }

    char ch  = str.charAt(0);
    String sstr = str.substring(1);
    ArrayList<String> ssres = gss(sstr);
    ArrayList<String> mmrs = new ArrayList<>();
    for(String ssr : ssres)
    {
     mmrs.add(""+ssr);
    }
    for(String ssr : ssres)
    {
     mmrs.add(ch+ssr);
    }
    return mmrs;

}
}