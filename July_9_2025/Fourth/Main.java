package July_9_2025.Fourth;

public class Main {
	public static boolean searchMatrix(int[][] mat, int target) {
		int n = mat.length;
		int m = mat[0].length;
		
		int left = 0, right = n * m - 1;
		
		while (left <= right) {
			int mid = left + (right - left) / 2;
			int row = mid / m;
			int col = mid % m;
			int midElement = mat[row][col];
			
			if (midElement == target) {
				return true;
			} else if (midElement < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		int[][] mat = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12}
		};
		int target = 13;
		
		boolean found = searchMatrix(mat, target);
		if (found) {
			System.out.println("Target Found");
		} else {
			System.out.println("Target Not Found");
		}
	}
}