import java.util.Scanner;

public class Sorting {
	static void sortArray(double[] ar) {
		for (int i=0; i < ar.length-1; i++) {
			
			if (ar[i] > ar[i+1]) {
				//swap
				double temp = ar[i];
				ar[i] = ar[i+1];
				ar[i+1] = temp;
			}
		}
		
		System.out.print("{");
		for (int i=0; i< ar.length; i++) {
			System.out.print(ar[i] + ", ");
		}
		System.out.print("}");
		
	}

	//the following method is to read input form the user
	static void readArray(int i) {
		Scanner input = new Scanner(System.in);
		double[] arr = new double[i];
		for (int x=0;x<i;x++) {
			System.out.println("What is the [" + (x+1) +"] index of the arrey?\n");
			arr[x] = input.nextDouble();
		}
		sortArray(arr);
	}

	//the following is entry point
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please choose your array length.\n>>");
		int arrLen = input.nextInt();
		System.out.println(readArray(arrLen));
	}
}
