class Solution {
    public int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){ // 17, 
            max = -1;
            for(int j = i + 1 ; j < arr.length ; j++){
                int num = arr[j]; // 18
                max = Math.max(num , max); // max = 18, 
            }

            result[count] = max; // [18, , , , ,-1]
            count++;

        }

        result[result.length - 1] = -1;

        return result;
    }
}