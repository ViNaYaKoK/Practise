package arrays;

import java.util.Scanner;

public class SumArrayUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter array size");
		int size  = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter "+size+" element");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("The sum of array are:"+sum);

	}

}
