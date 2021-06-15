package bitwise;

public class powerOfTwo6 {
	public static void main(String[] args) {
		System.out.println(isPowerofTwo(20) ? "YES": "NO");
		System.out.println(isPowerofTwo(512) ? "YES": "NO");
	}
	
	public static boolean isPowerofTwo(long n){
		long temp = n;
		while (temp != 0) {
		    if ((temp & 1) == 1) {
		        if ((temp >> 1) == 0)
		            return true;
		        else 
		            return false;
		    }
			temp >>= 1;
		}
		return false;
    }
}
