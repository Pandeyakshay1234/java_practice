import java.util.*;

public class CommonElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first array size and elements");
        System.out.println(" array size:");
        int n1 = scn.nextInt();
        System.out.println("Enter array Elements");
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }
        System.out.println("Enter second array size and elements");
        System.out.println(" array size:");
        int n2 = scn.nextInt();
        System.out.println("Enter array Elements");
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scn.nextInt();
        }

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int val : arr1) {
            if (hm.containsKey(val)) {
                int of = hm.get(val);
                int nf = of + 1;
                hm.put(val, nf);
            } else {
                hm.put(val, 1);
            }
        }

        System.out.println("here are new array with common elements");

        for (int val : arr2) {
            if (hm.containsKey(val) && hm.get(val) > 0) {

                System.out.println(val);
                int of = hm.get(val);
                int nf = of - 1;
                hm.put(val, nf);
            }
        }

    }
}
