package basic;

import java.util.Scanner;

public class CheckArray {
	public static void main(String[] args) {
		
		Scanner sk = new Scanner(System.in);
		
		int n = sk.nextInt();
		int[] a= new int[n];
		for (int i = 0; i<n; i++) {
			a[i]= sk.nextInt();
		}
		int x = sk.nextInt();
		
		boolean found = false;
		for(int num : a) {
			if (num == x) {
				found = true;
				break;
			}
		}
		
		if(found) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}
		
	}

}
