package BackTracking;

public class Q2_TheKnightTourProblem {
    public static boolean knightTourProblem(int[][] grid,int[] iSteps,int[] jSteps,int s,int e,int total ,int stepCount){

        System.out.println(s+" "+e+" "+stepCount+" "+total);
        if(stepCount==total){
            System.out.println("result--------");
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid.length;j++){
                    System.out.print(grid[i][j]+" ");
                }
                System.out.println();
            }
            return true;
        }

        for(int k=0;k<8;k++){
            int n= grid.length;
            int i =s + iSteps[k];
            int j =e + jSteps[k];
            if(i >= 0 && j >= 0 && i < n &&
                    j < n && grid[i][j] == -1){
                System.out.println("--inside---" + i + " " + j + " ");
                grid[i][j] = stepCount;
                if(knightTourProblem(grid, iSteps, jSteps, i, j, total, stepCount + 1)){
                    return true;
                };
                grid[i][j] = -1;
//                System.out.println("after----");
//                for(int x=0;x<grid.length;x++){
//                    for(int y=0;y<grid.length;y++){
//                        System.out.print(grid[x][y]+" ");
//                    }
//                    System.out.println();
//                }
//                System.out.println("---------------------");
//                 grid[i][j]=-1;
            }
        }
        return false;
//
//        0 5 14 9 20
//        13 8 19 4 15
//        18 1 6 21 10
//        7 12 23 16 3
//        24 17 2 11 22
    }

    public static void main(String[] args) {

        int n = 5;

        int[][] grid = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=-1;
            }
        }
        grid[0][0]=0;
//        int[] iSteps = new int[]{-2,-2,-1,1,2,2,1,-1};
//        int[] jSteps = new int[]{-1,1,2,2,-1,1,-2,-2};

        // 8 directions of knight moves
        int[] iSteps = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] jSteps = {1, 2, 2, 1, -1, -2, -2, -1};

        if(knightTourProblem(grid,iSteps,jSteps,0,0,n*n,1)){
            System.out.println("found");
        }else {
            System.out.println("not found");
        }
    }
}
