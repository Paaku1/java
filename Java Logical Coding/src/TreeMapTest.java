import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TreeMapTest {
    public static void main(String[] args) {
        int[][] nums1 = { {1, 2}, {3, 4},{6,4}, {5, 6}};
        int[][] nums2 = { {1, 3}, {3, 5}, {7, 8}};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i][0],nums1[i][1]);
        }
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i][0])){
                map.put(nums2[i][0],map.get(nums2[i][0])+nums2[i][1]);
            } else {
                map.put(nums2[i][0],nums2[i][1]);
            }
        }
        int[][] res = new int[map.size()][2];
        int k=0;
        for(Integer i : map.keySet()){
            res[k][0] = i;
            res[k++][1] = map.get(i);
        }
        for(int[] i : res){
            System.out.println(Arrays.toString(i));
        }

    }
}
