package Array;

public class TwoSumBruteForce {
    public static void main(String[] args){
        int arr[] = {2,6,5,8,11};
        int target = 14;
        boolean exists = false;
        for(int start = 0 ; start < arr.length ; start++) {
            for (int end = start + 1; end < arr.length; end++) {
                int sum = 0;
                sum = arr[start] + arr[end];
                if (sum == target) {
                    System.out.println("Two Sum Found at indexed: " + start + "+" + end);
                    System.out.println("Value: " + arr[start] + "+" + arr[end] + " = " + target);
                    exists = true;
                }
            }
        }
        if(!exists){
            System.out.println("2 sum doesn't exists");
        }
    }
}
