import java.util.*; 
  class display{
    public  synchronized void wish(String Name)
    {
        for(int i=0;i<10;i++)
        {System.out.print("Good Morning:");
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){ }
         System.out.println(Name);
        }
    }
 }

   class Mythread extends Thread{
       display d;
       String Name;
       Mythread(display d , String Name)
       {
        this.d = d;
        this.Name = Name;
       }
    public  void run()
    {
        d.wish(Name);
    }

  }
public class sysnchonisationDemo {
    public static void main(String[] args) {
        display d = new display();
        Mythread t1= new Mythread(d,"Dhoni");
        Mythread t2= new Mythread(d,"Akshay");
        t1.start();
        t2.start();
    }

}
