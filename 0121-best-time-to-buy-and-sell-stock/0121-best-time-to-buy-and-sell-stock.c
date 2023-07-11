int maxProfit(int* prices, int pricesSize){
    int profit = 0;
    int smallestPriceIndex = 0;

    for (int i = 1; i < pricesSize; ++i) {
        if (prices[i] < prices[smallestPriceIndex]) {
            smallestPriceIndex = i;
        } else {
            int possibleNewProfit = prices[i] - prices[smallestPriceIndex];
    
            if (possibleNewProfit > profit) {
                profit = possibleNewProfit;
            }
        }
    }

    return profit;
}