import java.util.*;
public class LL {
    Node head;
    
  public class Node{
        String Data;
        Node next;
     
   Node(String Data)
   {
     this.Data = Data;
     this.next= null;
   }
  }
   public void addfirst(String Data)
   {   Node newnode = new Node(Data);
      if(head ==null){
         head = newnode;
         return;
      }
      newnode.next=head;
      head=newnode;
   }
   public void addLast(String Data)
   {
    Node newnode = new Node(Data);
    if(head==null)
    {
        head = newnode;
        return;
    }
    Node currNode = head; 
    while(currNode.next!=null)
    {
        currNode = currNode.next;
    }
       currNode.next = newnode;

   }
  public static void main(String[] args) {
    LL list = new LL();
    list.addfirst("a");
    list.addfirst("b");
    list.printlist();
    list.addLast("list");
    list.printlist();
  }
  public void printlist()
  {
    if(head==null)
    {
        System.out.println("empty");
        return;
    }
    Node curNode = head;
    while(curNode!=null)
    {
        System.out.print(curNode.Data);
        curNode=curNode.next;
    }
   
  }


}
