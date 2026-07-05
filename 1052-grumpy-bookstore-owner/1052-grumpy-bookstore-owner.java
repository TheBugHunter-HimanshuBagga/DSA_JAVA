// class Solution {
//     public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
//         // n minutes store open
//         // 
//         int n = customers.length;
//         int maxSum = 0;
//         for(int i = 0 ; i < n ; i++){

//             if(grumpy[i] == 0){ // he is happy
//                 maxSum += customers[i];
//             }
//         }
//         int alreadySatisfied = maxSum;
//         int maxExtra = 0;
//         for(int i = 0 ; i <= n - minutes; i++ ){
//             int sum = 0;
//             for(int j = i ; j < i + minutes ; j++){
//                 if(grumpy[j] == 1){
//                     sum += customers[j];
//                 }
//             }
//             maxExtra = Math.max(sum,maxExtra);
//         }
//         return alreadySatisfied + maxExtra;
//     }
// }

class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        // n minutes store open
        // SLIDING_WINDOW
        int n = customers.length;
        int left = 0; 
        int maxSum = 0;
        for(int i = 0 ; i < n ; i++){ // grumpy array traversal 
            if(grumpy[i] == 0){ // He is happy
                maxSum += customers[i];
            }
        }
        int alreadySatisfied = maxSum;
        int extraSum = 0;
        int sum = 0;
        for(int right = 0 ; right < n ; right++){
            if(grumpy[right] == 1){
                sum += customers[right];
            }
            if( right - left + 1 == minutes){ // window size
                

                extraSum = Math.max(sum,extraSum);

                if(grumpy[left] == 1){
                    sum -= customers[left];
                }

                left++;
            }
        }
        return extraSum + alreadySatisfied;
    }
}