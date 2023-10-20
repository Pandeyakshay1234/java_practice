import java.util.Scanner;

public class Reverse_no {
    public static void main(String[] args) {
        System.out.println("enter nomber to  reverse");
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         String s = "";
         int temp = n;
         while(temp!=0)
         {
            int rem  = temp%10;
            s=s+rem;
            temp = temp/10;
         }
        System.out.println(s);
    }
    }


