// Last updated: 13/02/2026, 10:09:12
class Solution {

    int EMPTY = 0;
    int FRESH = 1;
    int ROTTEN = 2;

    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new ArrayDeque<>();

        int n = grid.length;
        int m = grid[0].length;
        int fresh = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == FRESH) {
                    fresh += 1;
                } else if (grid[i][j] == ROTTEN) {
                    queue.add(new int[] { i, j });
                }
            }
        }

        if (fresh == 0) return 0;

        int[][] dirs = new int[][] { {0,1}, {1,0}, {-1,0}, {0,-1} };

        int minute = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] pos = queue.poll();
                for (int[] dir : dirs) {
                    int ni = pos[0] + dir[0];
                    int nj = pos[1] + dir[1];
                    if (ni < 0 || ni == n || nj < 0 || nj == m) continue;
                    if (grid[ni][nj] == FRESH) {
                        grid[ni][nj] = ROTTEN;
                        fresh -= 1;
                        queue.add(new int[] {ni, nj});
                    }
                }
            }

            minute += 1;
        }

        if (fresh > 0) return -1;
        return minute - 1;
    }
}