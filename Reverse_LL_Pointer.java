
import java.io.*;
import java.util.*;

public class Reverse_LL_Pointer {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    void addfirst(int val)
    {
      Node temp = new Node();
      temp.data = val;
      temp.next = head;
      head = temp;
      if(size == 0)
      {
        tail = temp;
      }
      size++;
   
    }
    void addLast(int val) {
      Node temp = new Node();
      temp.data = val;
      temp.next = null;

      if (size == 0) {
        head = tail = temp;
      } else {
        tail.next = temp;
        tail = temp;
      }
      size++;
    }

    public int size(){
     
      return size;
    }

    public void display(){
      Node temp = head;
      while(temp!=null)
    {  System.out.println(temp.data+"");
        temp = temp.next;

      }
    }

    public void ReversePI()
    {
        Node pre =  null;
        Node curr = head;
       while(curr!=null)
       {
        Node next = curr.next;
        curr.next = pre;
        pre = curr;
        curr = next;
       }
      Node temp = head;
      head = tail;
      tail = temp;
    }
    // private Node getNode(int idx)
    // {
    //   Node temp = head;
    //   for(int i=0;i<idx;i++)
    //   {
    //     temp = temp.next;
    //   }
    //   return temp;
    // }

    // public void Reverse() {
    //   int li = 0;
    //   int ri = size-1;
    // while(li<ri)
    //   {
    //     Node left = getNode(li);
    //     Node right = getNode(ri);
    //     int temp = left.data;
    //     left.data = right.data;
    //     right.data = temp; 
    //     li++;
    //     ri--;
    //   }
    // } 
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LinkedList list = new LinkedList();
      String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("addfirst"))
      {
        int val = Integer.parseInt(str.split(" ")[1]);
        list.addfirst(val);
      }
      if(str.startsWith("addLast")){
        int val = Integer.parseInt(str.split(" ")[1]);
        list.addLast(val);
   
      } else if(str.startsWith("size")){
        System.out.println(list.size());
      } else if(str.startsWith("display")){
        list.display();
      }
    //    else if(str.startsWith("Reverse"))
    //    {
    //     list.Reverse();
    //    }
       else if(str.startsWith("ReversePI"))
       {
        list.ReversePI();
       }
      str = br.readLine();
    }
  }
}


