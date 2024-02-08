public class joinprac extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){}
            System.out.println("seetha thread");
        }
    }
}
class joindemo 
{
    public static void main(String[] args) throws InterruptedException {
        
        joinprac j = new joinprac();
         j.start();
        j.join();
        for(int i=0;i<10;i++)
        {
          System.out.println("Akshay thread");
        }
    }

}