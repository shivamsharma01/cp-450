package shivam.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeIntervals12 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 	4
			1 3
			2 6
			8 10
			15 18
		 */
		int m = scan.nextInt();
		int[][] arr = new int[m][2];
		for(int i=0; i<m; i++) {
			arr[i][0] = scan.nextInt();
			arr[i][1] = scan.nextInt();
		}
		arr = merge(arr);
		for (int[] a: arr)
			System.out.print("["+a[0]+","+a[1]+"]"+", ");
	}
	public static int[][] merge(int[][] intervals) {
        mergeSort(intervals, 0, intervals.length-1);
        List<int[]> out = new ArrayList<>();
        out.add(new int[] {intervals[0][0], intervals[0][1]});
        
        for (int i=1; i < intervals.length; i++) {
            if (out.get(out.size() - 1)[1] >= intervals[i][0])
                out.get(out.size()-1)[1] = Math.max(out.get(out.size()-1)[1], intervals[i][1]);
            else
                out.add(new int[] {intervals[i][0], intervals[i][1]});
        }
        return convertIntegers(out);
    }
    
    private static void mergeSort(int[][] intervals, int left, int right) {
        if (left < right) {
            int mid = left + (right - left)/2;
            mergeSort(intervals, left, mid);
            mergeSort(intervals, mid+1, right);
            merge(intervals, left, mid, right);
        }
    }
    
    public static int[][] convertIntegers(List<int[]> out) {
        int[][] ret = new int[out.size()][];
        for (int i=0; i < ret.length; i++)
            ret[i] = out.get(i);
        return ret;
    }
    
    private static void merge(int[][] intervals, int left, int mid, int right) {
        int[][] arr1 = new int[mid-left+1][], arr2 = new int[right-mid][];
        for (int i=0; i< arr1.length; i++)
            arr1[i] = new int[] {intervals[i+left][0], intervals[i+left][1]};
        for (int i=0; i< arr2.length; i++)
            arr2[i] = new int[] {intervals[i+mid+1][0], intervals[i+mid+1][1]};
        int index = left, i1=0, i2=0;
        while (i1 < arr1.length && i2 < arr2.length) {
            if (arr1[i1][0]<=arr2[i2][0])
                intervals[index++] = arr1[i1++];
            else
                intervals[index++] = arr2[i2++];
        }
        while (i1 < arr1.length)
            intervals[index++] = arr1[i1++];
        while (i2 < arr2.length)
            intervals[index++] = arr2[i2++];
    }
}
