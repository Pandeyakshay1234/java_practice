import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class PriorityQueue {

     ArrayList<Integer> Data;
     public PriorityQueue()
     {
        Data = new ArrayList<>();
     }
     public  void add(MergeSList.Pair p)
     { Data.add(p);
        upheapify(Data.size()-1);
      
     }
     private void upheapify(int i)
     {
        int pi = (i-1)/2;
        if(Data.get(i)<Data.get(pi))
        {
            swap(i,pi);
            upheapify(pi);
        }
     }
     public void swap(int i ,int j)
    {
         int ith = Data.get(i);
         int jth = Data.get(j);
         Data.set(i , jth);
         Data.set(j,ith);
    }
     public MergeSList.Pair remove()
     {
       if(this.size()==0)
       {
        System.out.println("underflow");
        return -1;
       }
          swap(0 , Data.size()-1);
          int val =  Data.remove(Data.size()-1);
          downheapify(0);
          return val;
     }

     public void downheapify(int pi)
     {
        int li = (2*pi)+1;
       int mini = pi;

        if(pi<Data.size() &&  Data.get(li)<Data.get(mini))
        {
         mini = li;
        }
        int ri = (2*pi)+2;
        if(pi<Data.size() && Data.get(ri)<Data.get(mini))
        {
            mini= ri;
        }
       if(mini!=pi)
       {
        swap(pi,mini);
        downheapify(mini);
       }
     }

     public int  size()
     {
        return Data.size();
     }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue qu = new  PriorityQueue();
        String str;
        while ((str = br.readLine()) != null && !str.equals("quit")) {
            if (str.startsWith("size")) {
                System.out.println("Size: " + qu.size());
            } else if (str.startsWith("add")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                qu.add(val);
            } else if (str.startsWith("remove")) {
                if (!qu.isEmpty()) {
                    int val = qu.remove();
                    System.out.println("Removed: " + val);
                } else {
                    System.out.println("Queue is empty.");
                }
            } else if (str.startsWith("peek")) {
                if (!qu.isEmpty()) {
                    int val = qu.peek();
                    System.out.println("Peek: " + val);
                } else {
                    System.out.println("Queue is empty.");
                }
            }
        }
    }
    
   }
  



   // public static void main(String[] args) {
   //     PriorityQueue pq = new PriorityQueue();

   //     // Adding elements to the priority queue
   //     pq.add(5);
   //     pq.add(2);
   //     pq.add(8);
   //     pq.add(1);

   //     // Printing all elements
   //     System.out.println("Elements in the Priority Queue:");
   //     printElements(pq);

   //     // Removing elements
   //     int removedElement = pq.remove();
   //     System.out.println("Removed element: " + removedElement);

   //     // Printing all elements after removal
   //     System.out.println("Elements in the Priority Queue after removal:");
   //     printElements(pq);
   // }

   // // Helper method to print all elements in the priority queue
   // public static void printElements(PriorityQueue pq) {
   //     ArrayList<Integer> elements = pq.Data;
   //     for (int element : elements) {
   //         System.out.print(element + " ");
   //     }
   //     System.out.println();
   // }
