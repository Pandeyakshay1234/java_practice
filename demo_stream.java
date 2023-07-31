import java.util.*;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class demo_stream{
 public static void main(String [] args){

   List<String>strings=List.of("I","am","the","list","of","strings");
    Stream<String>stream=strings.stream();
    Stream<String>limit=stream.limit(4); 
    //long result=limit.count();
    //System.out.println("result="+result);
    List<String>result=limit.collect(Collectors.toList());
   System.out.println("result="+result);

} 

}