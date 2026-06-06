package Array;

import java.util.ArrayList;
import java.util.List;

public class printAllSubarrays {
    public static void main(String[] args){
        int arr[] = {2,5,1,7,10};

        for(int start = 0 ; start < arr.length; start++){
            for(int end = start ; end < arr.length ; end++){
                for(int printFrom = start ; printFrom <= end ; printFrom++){
                    System.out.println(arr[printFrom] + " ");
                }
                System.out.println();
            }
        }
    }
}
