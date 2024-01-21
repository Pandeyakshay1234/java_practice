import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class MergeSList {
    public static class Pair implements Comparable<Pair> {
        int li;
        int di;
        int val;

        public Pair(int li, int di, int val) {
            this.li = li;
            this.di = di;
            this.val = val;
        }

        @Override
        public int compareTo(Pair o) {
            return this.val - o.val;
        }
    }

    public static ArrayList<Integer> MergeKSortList(ArrayList<ArrayList<Integer>> lists) {
        ArrayList<Integer> rv = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i = 0; i < lists.size(); i++) {
            Pair p = new Pair(i, 0, lists.get(i).get(0));
            pq.add(p);
        }
        while (pq.size() > 0) {
            Pair p = pq.remove();
            rv.add(p.val);
            p.di++;

            if (p.di < lists.get(p.li).size()) {
                p.val = lists.get(p.li).get(p.di);
                pq.add(p);
            }
        }
        return rv;

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());

        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < k; i++) {

            ArrayList<Integer> list = new ArrayList<>();

            int n = Integer.parseInt(br.readLine());
            System.out.println(n);

            String[] elements = br.readLine().split(" ");

            for (int j = 0; j < n; j++) {

                list.add(Integer.parseInt(elements[j]));

            }

            lists.add(list);

        }

        ArrayList<Integer> mlist = MergeKSortList(lists);
        System.out.println(mlist);

    }

}