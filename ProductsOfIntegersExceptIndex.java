import java.lang.Math;
import java.util.Arrays;


public class ProductsOfIntegersExceptIndex{
	

	public static void main (String args[]){
		int[] inputArray = {1,4,5,7,3};
		getProductOfIntegers(inputArray);
	}

	public static void getProductOfIntegers(int[] inputArray){

		if(inputArray.length <2){
			throw new IllegalArgumentException("more than 2 integers required");
		}

		int productSoFar = 1;
		int[] productArray = new int[inputArray.length];
		for(int i = 0 ; i < inputArray.length ;i++){
			productArray[i] = productSoFar;
			productSoFar *= inputArray[i]; 
		} 
		//System.out.println(Arrays.toString(productArray));

		productSoFar = 1;
		for (int i = inputArray.length-1 ; i >=0; i--){
			productArray[i] *= productSoFar;
			productSoFar *= inputArray[i];
		}

		System.out.println(Arrays.toString(productArray));
	}

}