package arrays;


import java.util.Scanner;
public class PrintArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int arr[] = new int [size];
		
		System.out.println("enter "+size+" element");
		
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println("Arrays elements are");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
