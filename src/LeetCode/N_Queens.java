package LeetCode;

import java.util.Scanner;

public class N_Queens {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Queens: ");
        n = scanner.nextInt();
        B = new char[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                B[i][j] = '.';
            }
            solveNQueen(0);
        }
    }
    static int n ;
    static char[][] B;
    static boolean isSafe(int r , int c){
        // check Horizontal Condition
        for(int j=0 ; j < n - 1 ; j++){
            if(B[r][j] == 'Q'){
                return false;
            }
        }
        // check vertical Condition
        for(int i=0 ; i <= n-1 ; i++){
            if(B[i][c] == 'Q'){
                return false;
            }
        }
        // check left Diagonal
        for(int i = r , j = c ; i >= 0 && j >= 0 ; i--,j--){
            if(B[i][j] == 'Q'){
                return false;
            }
        }
        // check Right Diagonal
        for(int i = r , j = c ; i >= 0 && j <= n ; i--,j++){
            if(B[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    static void solveNQueen(int row){
        if(row == n){
            printBoard();
            System.out.println();
            return;
        }
        for(int col = 0 ; col < n ; col++){
            if(isSafe(row , col)){
                B[row][col] = 'Q';
                solveNQueen(row+1);
                B[row][col] = '.';
            }
        }
    }

    static void printBoard(){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0  ; j < n ; j++){
                System.out.println(B[i][j] + " ");
            }
            System.out.println();
        }
    }
}
