import java.util.*;
public class Get_common_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int [] arrn1 = new int[n1];
        for(int i=0;i<arrn1.length;i++)
        {
            arrn1[i]=sc.nextInt();
        }
     int n2 = sc.nextInt();
     int [] arrn2 = new int[n2];
     for(int i=0;i<arrn2.length;i++)
     {
        arrn2[i]=sc.nextInt();
     }
     HashMap<Integer,Integer> hm = new HashMap<>();
     for(int val:arrn1)
     {
        if(hm.containsKey(val))
        {
            int of = hm.get(val);
            int nf = of+1;
            hm.put(val,1); 
        }
        else 
        {
            hm.put(val,1);
        }
     }
     for(int val:arrn2)
     {
        if(hm.containsKey(val))
        {
            System.out.println(val);
            hm.remove(val);
        }
     } 
    }
}
