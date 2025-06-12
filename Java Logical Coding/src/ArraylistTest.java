import java.util.*;

public class ArraylistTest {
    public static void main(String[] args) {
        List<List<Integer>> x = new ArrayList<>();

        int[] arr1 = { 1, 2, 3 };
        List<Integer> list1 = new ArrayList<>();
        for (int i : arr1) {
            list1.add(i);
        }
        x.add(list1);
        System.out.println(x);
        
        int[] arr2 = { 4, 5, 6 };
        List<Integer> list2 = new ArrayList<>();
        for (int i : arr2) {
            list2.add(i);
        }
        x.add(list2);
        System.out.println(x);
    }

}