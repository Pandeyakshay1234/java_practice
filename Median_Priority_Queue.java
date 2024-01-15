import java.util.*;

import org.omg.Messaging.SyncScopeHelper;

public class Median_Priority_Queue {
    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;

    public void MedianPriorityQueue() {
        right = new PriorityQueue<>();
        left = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void add(int val) {

        if (right.size() > 0 && val > right.peek()) {
            right.add(val);
        } else {
            left.add(val);
        }
        if (right.size() - left.size() == 2) {
            left.add(right.remove());
        } else if (left.size() - right.size() == 2) {
            right.add(left.remove());
        }

    }

    public int peek() {
        if (this.size() == 0) {
            System.out.println("underflow");
            return -1;
        }
        if (left.size() >= right.size()) {
            return left.peek();
        } else {

            return right.peek();
        }

    }

    public int remove() {
        if (this.size() == 0) {
            System.out.println("underflow");
            return -1;
        }
        if (left.size() >= right.size()) {
            return left.remove();
        } else {

            return right.remove();
        }
    }

    public int size() {
        int n = left.size() + right.size();
        return n;
    }

    public static void main(String[] args) {

        Median_Priority_Queue madianqueue = new Median_Priority_Queue();
        madianqueue.MedianPriorityQueue();
        madianqueue.add(20);
        madianqueue.add(30);
        madianqueue.add(40);
        int madianval = madianqueue.peek();
        int removeval = madianqueue.remove();
        System.out.println(madianval);
        System.out.println(removeval);

        System.out.println(madianqueue.size());
    }
}
