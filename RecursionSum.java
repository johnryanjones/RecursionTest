import java.util.Scanner;

public class RecursionSum {

	public static void main(String[] args) {
		
		//create new scanner object to obtain input from the user
		Scanner input = new Scanner(System.in);
		
		//ask user for input and store the data into integer variables
		  System.out.print("Please enter five integers to calculate the product: ");
		  int num1 = input.nextInt();
		  int num2 = input.nextInt();
		  int num3 = input.nextInt();
		  int num4 = input.nextInt();
		  int num5 = input.nextInt();
		  
		  //store the integers in an integer array
		  int arr[] = {num1, num2, num3, num4, num5};
		
		  //call the method to calculate and print the value to the console
		System.out.println("Product is: " + ProductOfNum(arr, arr.length-1));
		
		//close the scanner object
		input.close();
	}
	  static int ProductOfNum(int[] arr, int n) {
		  //base case where the array has no length
		  if (n == 0) {
			  return (arr[n]);
		  }
		  else {
			  //call the method utilizing recursion multiplying the integer elements
			  return (arr[n] * ProductOfNum(arr, n-1));
		  }
	  }
}
