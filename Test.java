import java.util.*;
 class parent{
    public void m1()
    {
        System.out.println("parent class");
    }
  
     class child extends parent{
    public void m1()
    {
        System.out.println("child class");
    }
  }  
}
  public class Test{
    public static void main (String [] args)
    
    {
      parent p = new parent();
      p.m1();
    }
  }

