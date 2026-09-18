class Solution {
    public int[] finalPrices(int[] prices) {
        // integer array prices, prices[i] is the price of i'th item in shop
        int n = prices.length;
        int[] answer = new int[n];
        int k = 0;
        for(int x: prices){
            answer[k] = x;
            k++;
        }
        for(int i = 0 ; i < n; i++){
            int num = prices[i];
            for(int j = i+1 ; j < n; j++){
                if(prices[j] <= prices[i]){
                    int sum = prices[i] - prices[j];
                    answer[i] = sum;
                    break;
                }else{
                    answer[i] = prices[i];
                }
            }
        }
        return answer;
    }
}