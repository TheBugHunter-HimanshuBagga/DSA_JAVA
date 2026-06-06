package Array;

public class SumOfSubarray {
    public static void main(String[] args){
        int arr[] = {2,5,1,7,10};
        int n = arr.length;

        for (int start = 0 ; start < n ; start++){
            for(int end = start ; end < n ; end++){
                int sum = 0;
                for(int print = start; print < end ; print++){
                    System.out.println(arr[print] + " ");
                    sum += arr[print];
                }
                System.out.println();
            }
        }
    }
}
