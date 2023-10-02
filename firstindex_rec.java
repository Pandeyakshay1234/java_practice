import java.util.*;

public class firstindex_rec {
    public static void main(String[] args) {
        System.out.println("Enter size of an Array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements of An Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter no to be search");
        int d = sc.nextInt();
        int index = FirstIndex(arr, 0, d);
        System.out.println(index);
    }

    public static int FirstIndex(int[] arr, int idx, int x) {
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == x) {
            return idx;
        } else {
            int fi = FirstIndex(arr, idx + 1, x);
            return fi;
        }
    }
}
