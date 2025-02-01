public class MinimumPathSum {

    // 64. Minimum Path Sum
    public int minPathSum(int[][] grid) {
        int i = 0, j = 1;
        for (; i < grid.length; i++) {
            for (j = 0; j < grid[i].length; j++) {
                if (i == 0 && j == 0) {
                    continue;
                } else if (i == 0) {
                    grid[i][j] += grid[i][j - 1];
                } else if (j == 0) {
                    grid[i][j] += grid[i - 1][j];
                } else {
                    grid[i][j] += Math.min(grid[i][j - 1], grid[i - 1][j]);
                }
            }
        }
        return grid[i - 1][j - 1];
    }

    public static void main(String[] args) {
        MinimumPathSum main = new MinimumPathSum();
        int result = main.minPathSum(new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        });
        System.out.println(result);
    }

}
