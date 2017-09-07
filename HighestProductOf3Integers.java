import java.lang.Math;

public class HighestProductOf3Integers{
	

	public static void main(String args[]){

		int[] inputArray = {1,-1,2,-2,0};
		getHighestProduct(inputArray);
		getHighestProductOf3Int(inputArray);
	}

	public static void getHighestProduct(int[] inputArray){

		if (inputArray.length < 3){
			throw new IllegalArgumentException("not possible");
		}

		int highest = Math.max(inputArray[0],inputArray[1]);
		int secondHighest = Math.min(inputArray[0],inputArray[1]);
		int lowest = Math.min(inputArray[0],inputArray[1]);
		int secondLowest = Math.max(inputArray[0],inputArray[1]);
		int highestProduct = inputArray[0]*inputArray[1]*inputArray[2];
		for (int i = 2 ; i<inputArray.length;i++){
			highestProduct = Math.max(Math.max(highestProduct, highest*secondHighest*inputArray[i]),lowest*secondLowest*highest);
			secondHighest = Math.min(Math.max(inputArray[i],secondHighest),highest);
			highest = Math.max(inputArray[i], highest);
			secondLowest = Math.max(Math.min(inputArray[i],secondLowest),lowest);
			lowest = Math.min(lowest,inputArray[i]);
			highestProduct = Math.max(highestProduct, lowest*secondLowest*highest);
			
		}
		System.out.println(highestProduct);
	}

	public static void getHighestProductOf3Int(int[] inputArray){
		if (inputArray.length < 3){
			throw new IllegalArgumentException("not possible");
		}
		int highest = Math.max(inputArray[0],inputArray[1]);
		int lowest = Math.min(inputArray[0],inputArray[1]);
		int highestProductOfTwo = inputArray[0]*inputArray[1];
		int lowestProductOfTwo = inputArray[0]*inputArray[1];
		int highestProduct = inputArray[0]*inputArray[1]*inputArray[2];

		for (int i = 2 ; i<inputArray.length;i++){
			int curr = inputArray[i];
			highestProduct = Math.max(Math.max(highestProduct,curr*highestProductOfTwo),curr*lowestProductOfTwo);

			highestProductOfTwo = Math.max(Math.max(highestProductOfTwo,curr*highest),curr*lowest);
			lowestProductOfTwo = Math.min(Math.min(lowestProductOfTwo,curr*highest),curr*lowest);
			highest = Math.max(curr,highest);
			lowest = Math.min(curr, lowest);

		}
	System.out.println(highestProduct);
}
}