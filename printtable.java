
public class printtable {
    public static void main(String[] args) {
        for(int i=1 ; i<=20;i++)
       { 
          System.out.print("           ");
          for(int j=1;j<=10;j++)
          {
             //System.out.print("        ");
              System.out.println("i*j= "+i*j  );
              System.out.println("  ");
          }
        System.out.print("           ");
       }
    }
}
