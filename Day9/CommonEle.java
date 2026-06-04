import java.util.*;
public class CommonEle{
    public static void main(String args[]){
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int n : arr1) {
            set1.add(n);
        }

        for (int n : arr2) {
            set2.add(n);
        }

        set1.retainAll(set2);

        System.out.println(set1);
    }
}
