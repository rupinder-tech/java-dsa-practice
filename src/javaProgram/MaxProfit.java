package javaProgram;

public class MaxProfit {

    public static void findMaxProfit(int[] prices){
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i=1; i< prices.length; i++){
            if(minPrice > prices[i]){
                minPrice = prices[i];
            }
            int profit = prices[i] - minPrice;
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }

        System.out.println("Max Profit:" + maxProfit);
    }
    public static void main(String[] args) {
        int[] prices = {9,8,9,6,10};
        findMaxProfit(prices);
    }
}
