package arrays;

public class Arrays123 {

	public static void main(String[] args) {
		int[] array = {25,26,27, -5, -4, 32, -8, 60};

		int i = 1;  //it has taken second element
		
		int tempTotal = 0;
		int total = array[0];
		//System.out.println(array[0]);
		for (int n : array) {
			boolean isElse = false;
			try {
				int arrayi = array[i];
			} catch (ArrayIndexOutOfBoundsException e) {
				break;
			}
			//System.out.println(array[i]);
		//	if (n >= 0 && array[i] >= 0 && (n + array[i+1]-array[i]) == array[i]) {
			if (n >= 0 && array[i] >= 0 && (n + 1) == array[i]) {
				
				if (tempTotal != 0) n = tempTotal;
				tempTotal = n + array[i];
				
				
			} else {
				isElse=true;
				if (total < tempTotal) total = tempTotal;
				tempTotal = 0;
				//System.out.println(array[i]);
				if (total < array[i]) total = array[i];
				
			}
			if (!isElse && total < tempTotal) total = tempTotal;
				
			i++;
		}
		
		System.out.println("greatest Number is = " + total);
	}
}
