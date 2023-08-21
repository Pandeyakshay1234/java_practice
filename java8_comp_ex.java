import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class java8_comp_ex {
    public static void main(String[] args)
    {
        List<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(40);
        list.add(30);
        list.add(99);
        list.add(5);
        list.add(50);
        Collections.sort(list,(a,b)->b-a);

        //Collections.sort(list,(a,b) -> b-a);
        System.out.println(list);


    }
}
