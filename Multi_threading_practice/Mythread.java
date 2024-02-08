
import java.util.*;
class Mythread extends Thread
{
   public void run()
   {
    for(int i=1;i<=10;i++)
    {

        System.out.println("child thread");
    }
   }
}
   
class Threadpractice{
     public static void main(String[] args) {

        Mythread t= new Mythread();
        t.run();
        for(int i =1;i<=10;i++)
        {
            System.out.println("this is main thread");
        }
    }
   }
