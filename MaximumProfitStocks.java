import java.lang.Math;

public class MaximumProfitStocks{
	
	public static void main(String args[]){

		int[] stockPricesYesterday = new int[]{9,6,5,3,8,10};

		getMaxProfit(stockPricesYesterday);
	}

	public static void getMaxProfit(int[] stockPricesYesterday){

		int currentPrice = 0;
		if (stockPricesYesterday.length <2){
			throw new IllegalArgumentException("Should have atleast 2 	prices");
		}
		int minPrice = stockPricesYesterday[0];

		int maxProfit = stockPricesYesterday[1]-stockPricesYesterday[0];

		for (int i = 1; i<stockPricesYesterday.length; i++){
			currentPrice = stockPricesYesterday[i];
			
			maxProfit = Math.max(maxProfit, currentPrice-minPrice);

			minPrice = Math.min(minPrice,currentPrice);
		}
		System.out.println(maxProfit);
	}
}
