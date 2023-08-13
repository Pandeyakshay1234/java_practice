import java.util.*;
public class countfreq {
   public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int d =  sc.nextInt();
   int freq = getDigitfreq(n,d);
   System.out.println(freq);
    
}

  public static int getDigitfreq(int n , int d)
{
     int count = 0;
     while(n>0)
{
     int r = n%10;
      n= n/10;
    if(r==d)
     {
        count++;
}   

}
    return count;

}
}