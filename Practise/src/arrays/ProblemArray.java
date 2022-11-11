package arrays;



public class ProblemArray {
	
	public static void main(String[] args) {
		int sum=0;
		int sum1=0;
		int arr[] = {1,2,3,-6,32,-5,64};
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]!=-arr[i])
			{
			 sum=sum+arr[i];
			 
			}
			
		}
		
		
		
		
	}
}

