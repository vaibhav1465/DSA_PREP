package BackTracking;

import java.util.ArrayList;

public class Q4_FindAllPossiblePaths {


    public static void solveAllPossiblePaths (ArrayList<ArrayList<Integer>> res,ArrayList<Integer> ds,int n,int m,int[][] grid,int row,int col){

//        System.out.println(ds+" "+row+" "+col);
        if(row==n-1 && col==m-1){
//            System.out.println("inside"+row+col);
            ds.add(grid[row][col]);
            res.add(new ArrayList<>(ds));
            ds.remove(ds.size() - 1);
            return;
        }
        ds.add(grid[row][col]);
        if(row+1<n) {
            solveAllPossiblePaths(res, ds, n, m, grid, row + 1, col);
        }
        if(col+1<m) {
            solveAllPossiblePaths(res, ds, n, m, grid, row, col + 1);
        }
        ds.remove(ds.size() - 1);
    }

    public static ArrayList<ArrayList<Integer>> findAllPossiblePaths(int n, int m,
                                                                     int[][] grid) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        solveAllPossiblePaths(res,ds,n,m,grid,0,0);
        return res;
    }

    public static void main(String[] args) {

        int[][] grid = {
                {1,2},
                {3,4}
        };
        int n = grid.length;
        int m = grid[0].length;
        ArrayList<ArrayList<Integer>> res= findAllPossiblePaths(n,m,grid);
        System.out.println(res);
    }
}
