package shivam.array;

import java.util.ArrayList;

public class SpiralTraversal37 {
	public static void main(String[] args) {
		ArrayList<Integer> result = spirallyTraverse(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }, 3, 3);
		for (int i : result)
			System.out.print(i + " ");
	}

	static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {
		ArrayList<Integer> out = new ArrayList<>();
		int left = 0, right = c - 1, top = 0, down = r - 1, dir = 0;
		while (left <= right && top <= down) {
			switch (dir) {
			case 0:
				c = left;
				while (c <= right)
					out.add(matrix[top][c++]);
				dir = 1;
				top++;
				break;
			case 1:
				r = top;
				while (r <= down)
					out.add(matrix[r++][right]);
				dir = 2;
				right--;
				break;
			case 2:
				c = right;
				while (c >= left)
					out.add(matrix[down][c--]);
				dir = 3;
				down--;
				break;
			case 3:
				r = down;
				while (r >= top)
					out.add(matrix[r--][left]);
				dir = 0;
				left++;
				break;
			}
		}
		return out;
	}
}
