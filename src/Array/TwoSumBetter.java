package Array;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSumBetter {
    public static void main(String[] args){
        int arr[] = {2,6,5,8,11};
        int target = 14;
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            int needed = target - arr[i];
            if(map.containsKey(needed)){
                return new int[]{map.get(needed),i};
            }
            map.get(arr[i],i);
        }
        return new int[]{};
    }
}
