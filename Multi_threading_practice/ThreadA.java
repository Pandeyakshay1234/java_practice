 class ThreadA {
    public static void main(String[] args) throws Exception {
        ThreadB b = new ThreadB();
        b.start();
        synchronized(b)
        {
          System.out.println("main thread calling wait method");
          b.wait();
          System.out.println("main thread get notification");
          System.out.println(b.total);
        }      
    }
}
class ThreadB extends Thread{
     int total=0;
     public void run()
   {
    synchronized(this)
    {
        System.out.println("child thread start calculate");
        for(int i=1;i<=100;i++)
    {
        total = total+i;
    }
  System.out.println("child thread giving notification");
  this.notify();
    }
   }
}
