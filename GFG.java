import java.io.*;
class GFG implements Runnable {
    public static void main(String args[])
    {
        // create an object of Runnable target
        GFG gfg = new GFG();
  
        // pass the runnable reference to Thread
        Thread t = new Thread(gfg, "gfg");
  
        // start the thread
        t.start();
  
        // get the name of the thread
        System.out.println(t.getName());
    }
    @Override public void run()
    {
        System.out.println("Inside run method");
    }
}