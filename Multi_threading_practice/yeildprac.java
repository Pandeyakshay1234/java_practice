public class yeildprac extends Thread {
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("child thread");
            Thread.yield();
        }
    }

}
class yeilddemo
{
    public static void main(String[] args) {
        yeildprac yp = new yeildprac();
        yp.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("main thread");
            Thread.yield();
        }
    }
}
