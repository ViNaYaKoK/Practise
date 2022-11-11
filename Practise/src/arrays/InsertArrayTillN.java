package arrays;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class InsertArrayTillN {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many numbers you will enter");
		int n = sc.nextInt();
		
		
		while(n > 20 || n<=0) {
			System.out.println("Invalid number");
			n=sc.nextInt();
			
		}
		
		int [] numbers = new int[n];
		fillArraysOfIntegers(numbers);
		printArrayOfIntegers(numbers);
		
		
		// TODO Auto-generated method stub

	}

	private static void printArrayOfIntegers(int[] numbers) {
		// TODO Auto-generated method stub
		System.out.print("The elements are");
		System.out.println(Arrays.toString(numbers));
		
	}

	public static void fillArraysOfIntegers(int[] numbers) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<numbers.length;i++)
		{
			numbers[i] = sc.nextInt();
		}
		
		
	}

}
