package arrays;

public class Arrays123 {

	public static void main(String[] args) {
		int[] array = { 25, 26, 27, -5, -4, 32, -8, 60};

		int i = 1;
		
		int tempTotal = 0;
		int total = array[0];
		for (int n : array) {
			boolean isElse = false;
			try {
				int arrayi = array[i];
			} catch (ArrayIndexOutOfBoundsException e) {
				break;
			}
			
			if (n >= 0 && array[i] >= 0 && (n + 1) == array[i]) {
				
				if (tempTotal != 0) n = tempTotal;
				tempTotal = n + array[i];
				
			} else {
				isElse=true;
				if (total < tempTotal) total = tempTotal;
				tempTotal = 0;
				if (total < array[i]) total = array[i];
				
			}
			if (!isElse && total < tempTotal) total = tempTotal;
				
			i++;
		}

		System.out.println("greatest Number is = " + total);
	}
}
