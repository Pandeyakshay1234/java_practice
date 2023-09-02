import java.util.*;

public class remove_prime_form_Arraylist {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> arr = new ArrayList<>();
    for(int i=0;i<n;i++)
    {
        arr.add(sc.nextInt());
    }
    solution(arr);
    System.out.println(arr);
    }
     public static void solution(ArrayList<Integer> arr)
     {
        int i;
        for(i=arr.size()-1;i>=0;i--)
        {
           int val = arr.get(i);
            if(isPrime(val)==true)
            {
                arr.remove(i);
            }
        }
        
     }

     public static boolean isPrime(int n)
     {
        int div;
         for(div=2;div*div<=n;div++)
         {
            if(n%div==0)
            {
                return false;
            }
         }
         return true;
     }

}
