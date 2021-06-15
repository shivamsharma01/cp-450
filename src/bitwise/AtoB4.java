package bitwise;

public class AtoB4 {
	public static void main(String[] args) {
		System.out.println(countBitsFlip(10, 20));
	}
	
	public static int countBitsFlip(int A, int B){
        int count = 0;
		while (A != 0 && B != 0) {
			if ((A & 1) != (B & 1))
				count++;
			A >>= 1;
			B >>= 1;
		}
		while (A != 0) {
			if ((A & 1) == 1)
				count++;
			A >>= 1;
		}
		while (B != 0) {
			if ((B & 1) == 1)
				count++;
			B >>= 1;
		}
		return count;
    }
}	
