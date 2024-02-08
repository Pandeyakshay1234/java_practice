public class set_get_name  extends Thread{

    
}
class ThreadDemo2
{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());// main thread name
        set_get_name sgn = new set_get_name();//made object of set_get_name class
          System.out.println(sgn.getName());// name of thatclass obejct
          Thread.currentThread().setName("Akshay");// set name of main method
          System.out.println(Thread.currentThread().getName());

    }
}
