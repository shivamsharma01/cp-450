package shivam.array;

public class MaxContiguousSubArray8 {
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,-2,5};
		System.out.println(maxSubarraySum(arr, arr.length));
	}
	
	static int maxSubarraySum(int arr[], int n){
        int max = arr[0];
        for (int i=1; i<n; i++) {
            arr[i] = Math.max(arr[i]+arr[i-1], arr[i]);
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
