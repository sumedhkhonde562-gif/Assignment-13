package largest;

import java.util.Scanner;

public class LargestElements {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int largest = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			if(arr[i]>largest) largest = arr[i];
		}
		
		int SecondLargest = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			if(arr[i]>SecondLargest && arr[i] != largest)
				SecondLargest = arr[i];
		}
		System.out.println(SecondLargest);
	}
}
