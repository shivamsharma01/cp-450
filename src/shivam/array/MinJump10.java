package shivam.array;

import java.util.Scanner;

public class MinJump10 {
	/*
	11
	1 3 5 9 6 2 6 7 6 8 9
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int[] arr = new int[m];
		for(int i=0; i<m; i++)
			arr[i] = scan.nextInt();
		System.out.println(minJumps(arr));
		
	}
	
	static int minJumps(int[] arr){
		if (arr.length <= 1)
			return 0;
        if (arr[0] == 0)
            return -1;
        int n = arr.length, maxReach, steps, jumps = 1;
        maxReach = arr[0];
		steps = arr[0];
		for(int i = 1; i < n; i++) {
			if (i == n - 1)
				return jumps;
			maxReach = Math.max(maxReach, arr[i] + i);
			steps--;
			if (steps == 0) {
				jumps++;
				if (i >= maxReach)
					return -1;
				else
					steps = maxReach - i;					
			}
		}
		return jumps;
    }
	
}
