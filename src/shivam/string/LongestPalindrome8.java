package shivam.string;

public class LongestPalindrome8 {
	
	public static void main(String[] args) {
		System.out.println(longestPalin("aaaabbaa"));
	}
	static String longestPalin(String S){
        int max = Integer.MIN_VALUE, n = S.length(), left, right;
        String ans = "";
        for (int i=0; i< n; i++) {
            // odd
            left = i - 1;
            right = i + 1;
            while (left >= 0 && right < n) {
                if (S.charAt(left) == S.charAt(right)) {
                    left--;
                    right++;
                } else 
                    break;
            }
            if (max < right - left - 1) {
                max = right - left - 1;
                ans = S.substring(left+1, right);
            }
            
            // even
            left = i;
            right = i + 1;
            while (left >= 0 && right < n) {
                if (S.charAt(left) == S.charAt(right)) {
                    left--;
                    right++;
                } else 
                    break;
            }
            if (max < right - left - 1) {
                max = right - left - 1;
                ans = S.substring(left+1, right);
            }
        }
        return ans;
    }
}
