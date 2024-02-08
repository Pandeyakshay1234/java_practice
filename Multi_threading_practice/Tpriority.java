public class Tpriority extends Thread
{
    
}
class demo3
{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(7);// if we comment this line than second  uotput will 5 
        Tpriority tp = new Tpriority();
        System.out.println(tp.getPriority());

    }
}
