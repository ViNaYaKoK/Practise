package arrays;

import java.util.Scanner;

public class TwoDArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size");
		int row = sc.nextInt();
		System.out.println("Enter column size");
		int column = sc.nextInt();
		
		int arr[] [] = new int[row] [column];
		
		System.out.println("Enter "+row*column+" elements");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Array elemnts are");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	
	}

}
