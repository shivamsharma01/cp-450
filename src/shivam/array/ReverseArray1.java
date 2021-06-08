package shivam.array;

import java.util.Scanner;

public class ReverseArray1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), temp;
		int[] arr = new int[n];
		for (int i = 0; i<arr.length; i++)
			arr[i] = scan.nextInt();

		for (int i=0; i<=(arr.length-1)/2; i++) {
			temp = arr[i];
			arr[i] = arr[n-(i+1)];
			arr[n-(i+1)] = temp;
		}
		
		for (int i = 0; i<arr.length; i++)
			System.out.print(arr[i]+" ");			
	}
}
