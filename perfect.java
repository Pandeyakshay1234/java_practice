import java.util.Scanner;
public class perfect {
    public static void main(String[] args) {
        System.out.println("Enter no to check");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;
        for(int i=1; i<num; i++)
        {
          if(num%i==0)
          {
            sum = sum+i;
          }
        } 
        if(sum==num)
        {
            System.out.println(num + "number is perfect");
        }
        else
        System.out.println("nomber is not perfect no");
    }
}
