class Solution {

   
      public static class Pair implements Comparable<Pair> {
		int i;
		int j;
		int eff;

		public Pair(int i, int j, int eff) {
			this.i = i;
			this.j = j;
			this.eff = eff;

		}

		public int compareTo(Pair o) {
			return this.eff - o.eff;
		}

	}

	public int minPathSum(int[][] grid) {
		PriorityQueue<Pair> q = new PriorityQueue<>();
		q.add(new Pair(0, 0, grid[0][0]));
		boolean[][] visited = new boolean[grid.length][grid[0].length];
		int[][] dirs = { { 0, 1 }, { 1, 0 } };
		while (!q.isEmpty()) {
			Pair r = q.poll();
			if (r.i == grid.length - 1 && r.j == grid[0].length - 1) {
				return r.eff;
			}
			if (visited[r.i][r.j] == true)
				continue;
			visited[r.i][r.j] = true;
			for (int k = 0; k < 2; k++) {
				int i = r.i + dirs[k][0];
				int j = r.j + dirs[k][1];

				if (i >= 0 && j >= 0 && i <= grid.length - 1 && j <= grid[0].length - 1 && visited[i][j] == false) {
					q.add(new Pair(i, j, grid[i][j] + r.eff));
				}
			}
		}
		return -1;
    }
}
