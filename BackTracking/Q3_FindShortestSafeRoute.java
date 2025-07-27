package BackTracking;

public class Q3_FindShortestSafeRoute {

    public static boolean valid(int[][] mat, int n, int row, int col) {

        //
//        [1, 0, 1, 1, 1],
//      [1, 1, 1, 1, 1],
//      [1, 1, 1, 1, 1],
//      [1, 1, 1, 0, 1],
//      [1, 1, 1, 1, 0]

        if(row>=n || col>=n || row<0 || col<0 ){
            return false;
        }

        if (mat[row][col] == 0) {
            return false;
        }
        if ((col+ 1 < n && mat[row][col+1] == 0) || (row - 1 >=0 && col + 1 <n && mat[row - 1][col + 1] == 0)) { // left and upper digonql
            return false;
        }

        if ((row-1 < n && mat[row-1][col] == 0) || (row - 1 >=0 && col + 1 <n && mat[row - 1][col + 1] == 0)) { // left and upper digonql
            return false;
        }

        if ((row + 1 < n && mat[row+1][col] == 0) || (row + 1 < n && col+1 <n && mat[row + 1][col + 1] == 0 ) ) { // down and digonal
            return false;
        }
        return true;
    }


    public static int solveShortestPath(int[][] mat, int n, int row, int col) {

        System.out.println(row+"---"+col+"---"+mat[row][col]);
        if (row >= n - 1) {
            return 1;
        }
        int min = Integer.MAX_VALUE;
        if (valid(mat, n, row , col+1)) { // left
            min =Math.min(min, 1 + solveShortestPath(mat, n, row, col+1));
        }
        if (valid(mat, n, row-1,  col)) { // up
            min =Math.min(min, 1 + solveShortestPath(mat, n, row-1, col));
        }
        if (valid(mat, n, row+1, col)) { // down
            min =Math.min(min, 1 + solveShortestPath(mat, n, row+1, col));
        }
        if (valid(mat, n, row+2, col)) { // down
            min =Math.min(min, 1 + solveShortestPath(mat, n, row+2, col));
        }
        return min;

    }

    public static int findShortestPath(int[][] mat) {
        // code here

        int n = mat.length;

        int result = solveShortestPath(mat, n, 0, 0);
        System.out.println(result);

        return result;


    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {1, 1, 1, 1, 0}
        };

        findShortestPath(matrix);
    }
}
