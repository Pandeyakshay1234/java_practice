import java.util.Scanner;
public class Factorial{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int value = f(n);
    System.out.print(value);
}
public static int f(int n)
{
    if(n==1){
        return 1;
    }
    int fnm1 = f(n-1);
    int val = n*fnm1;
    return val;
//    val*=n;
//    f(n-1,val);
//     return val;
}

}




              