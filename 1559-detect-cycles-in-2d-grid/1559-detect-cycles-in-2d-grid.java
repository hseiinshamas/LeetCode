class Solution {
    private int m, n;

    public boolean containsCycle(char[][] grid) {
        m = grid.length;
        n = grid[0].length;

        int[] rowDir = { 0, 1 }, colDir = { 1, 0 };
        UF connectivity = new UF(m * n);
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                for (int d = 0; d < 2; d++) {
                    if (r + rowDir[d] < 0 || r + rowDir[d] == m || c + colDir[d] < 0 || c + colDir[d] == n) {
                        continue;
                    }

                    if (grid[r][c] == grid[r + rowDir[d]][c + colDir[d]]) {
                        if (connectivity.find(coord2ind(r, c), coord2ind(r + rowDir[d], c + colDir[d]))) {
                            return true;
                        }

                        connectivity.union(coord2ind(r, c), coord2ind(r + rowDir[d], c + colDir[d]));
                    }
                }
            }
        }

        return false;
    }

    private int coord2ind(int row, int col) {
        return row * n + col;
    }

    private class UF {
        private int[] parents, treeSizes;

        public UF(int size) {
            parents = new int[size];
            treeSizes = new int[size];
            for (int i = 0; i < size; i++) {
                parents[i] = i;
                treeSizes[i] = 1;
            }
        }

        public void union(int node1, int node2) {
            int r1 = getRoot(node1), r2 = getRoot(node2);
            if (r1 == r2) {
                return;
            }

            if (treeSizes[r1] > treeSizes[r2]) {
                parents[r2] = r1;
                treeSizes[r1] += treeSizes[r2];
            } else {
                parents[r1] = r2;
                treeSizes[r2] += treeSizes[r1];
            }
        }

        public boolean find(int node1, int node2) {
            return getRoot(node1) == getRoot(node2);
        }

        private int getRoot(int node) {
            while (node != parents[node]) {
                parents[node] = parents[parents[node]];
                node = parents[node];
            }

            return node;
        }
    }
}
