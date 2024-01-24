import java.util.*;
import java.io.*;
public class CustomQueueMain {
    
  public static class CustomQueue{
     int[] data;
     int front;
     int size;

    public CustomQueue(int n)
    {
     data = new int[n];
     front = 0;
     size = 0;
    }
    public  void add(int val)
    { if(size==data.length)
      {
          System.out.println("overflow");
      }
      else {
        int rear = (size+front) % data.length;
         data[rear]  = val;
         size ++;
      }
      
    }
    public int remove()
   {
    if(size==0)
    { 
      System.out.println("underflow");
      return -1;
    }
    else{
      int val = data[front];
      front  = (front + 1)%data.length;
      size--;
      return data[front];
    }

   }
   public int size()
   {
    return size();
   }
  public int peek()
  {
    if(size==0)
    {
      System.out.println("underflow");
      return -1;
    }
    else{
       return data[front];
    }
  }
  private void display() {
    for(int i = 0;i<size;i++ )
    {
      int idx = (front+i)%data.length;
      System.out.println(data[idx]);
    }
  }
}
  public static void main(String[] args) throws IOException{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int n = Integer.parseInt(br.readLine());
     CustomQueue qu = new CustomQueue(n);
     String str = br.readLine();
     while(str.equals("quit")==false)
     {
      if(str.startsWith("add"))
      {
        int val = Integer.parseInt(str.split(" ")[1]);
         qu.add(val);
      }
      else if (str.startsWith("remove"))
      {
       int val =  qu.remove();
        if(val==-1)
        {
          System.out.println(val);
        }
      }
       else if(str.startsWith("peek"))
      {
         int val  = qu.peek();
         if(val==-1)
        {
          System.out.println(val);
        }
      }
      else  if(str.startsWith("size"))
      {
         System.out.println(qu.size());
      }
      else if(str.startsWith("display"))
      {
        qu.display();
      }
      str = br.readLine();
     }


  }
  

}


