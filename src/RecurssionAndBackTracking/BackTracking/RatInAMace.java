package RecurssionAndBackTracking.BackTracking;

public class RatInAMace {
    public static void main(String[] args){

        int mat[][] = {
                {1,1,1,0},
                {1,0,0,1},
                {1,1,0,0},
                {1,1,1,1}
        };
        int n = mat.length; //4
        int m = mat[0].length;//4

        boolean vis[][] = new boolean[n][m]; // false by default
        vis[0][0] = true;

        ratInMaze(mat , vis , 0 , 0 , "" , n , m);
    }
    static boolean isValid(int i , int j , int mat[][] , boolean vis[][] , int n , int m){
        if(i < n && i >= 0 && j < m && j >= 0 && mat[i][j] == 1 && vis[i][j] == false){
            return true;
        }
        return false;
    }

    static void ratInMaze(int mat[][], boolean vis[][] , int i , int j , String path , int n , int m){
        if(i == n-1 && j == m-1){ //Bottom right corner reached
            System.out.println(path);
            return;
        }
        //DLRU
        if(isValid(i+1 , j , mat , vis , n , m)){ //D
            vis[i+1][j] = true;
            ratInMaze(mat , vis , i+1 , j , path + "D" , n , m);
            vis[i+1][j] = false;
        }
        if(isValid(i , j - 1 , mat , vis , n , m)){ //L
            vis[i][j-1] = true;
            ratInMaze(mat , vis , i , j-1 , path + "L" , n , m);
            vis[i][j-1] = false;
        }
        if(isValid(i , j + 1 , mat , vis , n , m)){ // R
            vis[i][j+1] = true;
            ratInMaze(mat , vis , i , j+1 , path + "R" , n , m);
            vis[i][j+1] = false;
        }
        if(isValid(i-1 , j , mat , vis , n , m)){ // U
            vis[i-1][j] = true;
            ratInMaze(mat , vis , i-1, j , path + "U" , n , m);
            vis[i-1][j] = false;
        }
    }
}
