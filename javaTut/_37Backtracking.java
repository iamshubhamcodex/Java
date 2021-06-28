package javaTut;

//import java.util.ArrayList;

public class _37Backtracking {

	public static void main(String[] args) {
		// 	BACKTRACKING
		
		/**
		 *	Backtracking is an algorithmic-technique for solving problems recursively be trying to build a solution incrementally, one piece at a time, removing those solutions that fail to satisfy the constraints of the problem at any point of time. 
		 * 
		 **/

		//	Shortest Path in a Maze
//		int a[][] = {
//				{1,1,1,1,1,0,0,1,1,1},
//				{0,1,1,1,1,1,0,1,0,1},
//				{0,0,1,0,1,1,1,0,0,1},
//				{1,0,1,1,1,0,1,1,0,1},
//				{0,0,0,1,0,0,0,1,0,1},
//				{1,0,1,1,1,0,0,1,1,0},
//				{0,0,0,0,1,0,0,1,0,1},
//				{0,1,1,1,1,1,1,1,0,0},
//				{1,1,1,1,1,0,0,1,1,1},
//				{0,0,1,0,0,1,1,0,0,1}
//		};
//		int result = shortPath(a, 0, 0, 0, 9);
//		if(result >= 100000) {System.out.println("No Path Possible");}else {
//		System.out.println(result);}
		
		
		//	Partition an Array into Two equal sum Arrays
//		int a[] = {2,1,2,3,4,8,2};
//		int sum = 0;
//		for(int i: a) {
//			sum += i;
//		}
//		ArrayList<Integer> ans = new ArrayList<>();
//		boolean isPos = (sum&1) == 0 && partition(a, sum/2, 0, ans);
//		if(isPos) {
//			for(int j: ans) {System.out.print(j + " ");};
//		}else System.out.println("Not Possible");
	
	}
	
	// Partition an Array into Two equal sum Arrays
//	static boolean partition(int a[], int sum, int i, ArrayList<Integer> ans) {
//		if(i >= a.length || sum < 0)return false;
//		if(sum == 0) return true;
//		
//		ans.add(a[i]);
//		boolean leftPos	= partition(a, sum-a[i], i+1, ans);
//		if(leftPos)return true;
//		ans.remove(ans.size()-1);
//		return partition(a, sum, i+1, ans);
//	}
	
	
//	Shortest Path in a Maze
//	static int shortPath(int a[][], int i, int j, int x, int y) {
//		int rows = a.length;
//		int cols = a[0].length;
//		boolean vis[][] = new boolean[rows][cols];
//		return shortPath(a,i, j, x, y, vis);
//	}
//	static boolean isSafe(int a[][], int i, int j, boolean vis[][]) {
//		int rows = a.length;
//		int cols = a[0].length;
//		return i >=0 && j >= 0 && i < rows && j< cols && a[i][j] == 1 && !vis[i][j]; 
//	}
//	
//	static int shortPath(int a[][], int i, int j, int x, int y, boolean vis[][]) {
//		if(!isSafe(a, i, j, vis)) return 100000;
//		if(i == x && j == y)return 0;
//		vis[i][j] = true;
//		int left = shortPath(a, i, j-1, x, y, vis) +1;
//		int right = shortPath(a, i, j+1, x, y, vis) +1;
//		int bottom = shortPath(a, i+1, j, x, y, vis) +1;
//		int top = shortPath(a, i-1, j, x, y, vis) +1;
//		vis[i][j] = false;
//		return Math.min(Math.min(top, bottom), Math.min(left, right));
//	}
	
}
