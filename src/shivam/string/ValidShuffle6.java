package shivam.string;

public class ValidShuffle6 {
	public static void main(String[] args) {
		String A = "XY", B = "12", MAIN = "1XY2";
		System.out.println(isAValidShuffle(MAIN, A, B));
	}

	private static boolean isAValidShuffle(String main, String a, String b) {
		if (a.length() + b.length() != main.length())
			return false;
		int i1 = 0, i2 = 0, i = 0;
		while (i != a.length() + b.length()) {
			if (i1 < a.length() && a.charAt(i1) == main.charAt(i))
				i1++;
			else if (i2 < b.length() && b.charAt(i2) == main.charAt(i))
				i2++;
			else
				return false;
			i++;
		}
		return true;
	}
}
