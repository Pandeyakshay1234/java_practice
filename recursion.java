import java.util.*;

public class recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
    }
    public static void solution(int n)
    {   if(n<=0)
        {
            return;
        }
        System.out.println(n);
        solution(n-1);
        System.out.println(n);
    }

}
