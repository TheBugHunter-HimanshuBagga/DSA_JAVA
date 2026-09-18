// class Solution {
//     public int maxScore(int[] cardPoints, int k) {
//         int n = cardPoints.length;
//         // k window size
//         int maxSum = 0;
//         for(int front = 0 ; front <= k ; front++){
//             int back = k - front;
//             int sum = 0;
//             // Front Cards
//             for(int i = 0 ; i < front ; i++){
//                 sum += cardPoints[i];
//             }
//             // Back Cards
//             for(int j = n - back ; j < n ; j++){
//                 sum += cardPoints[j];
//             }

//             maxSum = Math.max(maxSum , sum);
//         }
//         return maxSum;
//     }
// }  

class Solution {
    public int maxScore(int[] cardPoints, int k) { // SLIDING WINDOW
        int n = cardPoints.length;
        int left  = 0;
        // k window size

        int sum=0;
        for(int  i=0;i<k;i++){
            sum += cardPoints[i];
        }

        int maxSum = sum;
        // replace the frontcard with back opne by one
        for(int i = 0 ; i < k ; i++){
            sum -= cardPoints[k - 1 - i];
            sum += cardPoints[n - 1 - i];
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }
}  