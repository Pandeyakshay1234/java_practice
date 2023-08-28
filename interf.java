import java.util.*;

interface interf
 {
    
    public void m1();
    public void m2();
    }

class ServiceProbvider implements interf
{
     //public static void main(String[] args) {
    public void m1(){
        System.out.println("hello");
    }
    public void m2()
    {
        System.out.println("ji hello");
    }
    public static void main(String[] args) {
        ServiceProbvider s = new ServiceProbvider();
        s.m1();
        s.m2();
    }
}



