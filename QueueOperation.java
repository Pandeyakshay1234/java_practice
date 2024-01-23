import java.util.*;

import javax.xml.transform.stream.StreamSource;
public class QueueOperation{
  public static void main(String[] args) {
    Queue<Integer> que = new ArrayDeque<>();
    que.add(10);
    que.add(20);
    que.add(30);
    que.add(40);// add in the last of the queue
    System.out.println(que);
    System.out.println(que.peek());//return first elemnt of the queue
    System.out.println(que);
    System.out.println(que.remove());// remove first element of the queue
    System.out.println(que.remove());
    System.out.println(que);
  }
}