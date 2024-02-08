public class ThereadbyRunnable implements Runnable{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("child thread"); // this code run by child thread 
        }
    }

}
 class ThreaDemo
 {
    public static void main(String[] args) {
        ThereadbyRunnable  tr = new ThereadbyRunnable();
        Thread t = new Thread(tr);// tr is target runnable 
        t.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("main thread"); // this code is run by makin thread
        }
    }
 }