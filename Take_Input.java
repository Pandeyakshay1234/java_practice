 import java.util.*;
 class Take_Input{

  public static void main(String[] args){ 
  Scanner sc = new Scanner(System.in);
  System.out.println("enter numbers of counting");
    int n = Integer.parseInt(sc.nextLine());
  System.out.println("enter name");
    String name = sc.nextLine();
  System.out.println("hello" + name + "your counting is");
  for(int i=1;i<=n;i++)
{
   System.out.println(i);

}

}
}