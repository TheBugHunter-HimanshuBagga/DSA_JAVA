package Array;

public class BestTimeToBuyAndSellStock {
    public static int main(String[] args) {
        // firt buy the stock and then the day after that sell it
        int prices[] = {7,1,2,4,6,0};
        int p = prices.length;
        int maxProfit = 0;
        // can't sell the stock on the same day
        for(int purchase = 0 ; purchase < p ; purchase++){
            for(int sell = purchase + 1 ; sell < p ; sell++){
                int profit = prices[sell] - prices[purchase];
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
