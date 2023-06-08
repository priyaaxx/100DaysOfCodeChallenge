public class Day39
{
    public int islandPerimeter(int[][] grid) {
        int n = grid.length , m = grid[0].length;
        int perimeter = 0 , sides = 0;
        for(int i = 0 ; i < n ; i++)
            for(int j = 0 ; j < m;  j++) {
                if(grid[i][j] == 1) {
                    sides = 0;
                    if(i == 0)
                        sides++;
                    else if(grid[i - 1][j] == 0)
                        sides++;
                    if(j == 0)
                        sides++;
                    else if(grid[i][j - 1] == 0)
                        sides++;
                    if(i == n - 1)
                        sides++;
                    else if(grid[i + 1][j] == 0)
                        sides++;
                    if(j == m - 1)
                        sides++;
                    else if(grid[i][j + 1] == 0)
                        sides++;
                    perimeter += sides;
                }
            }
        return perimeter;
    }
}