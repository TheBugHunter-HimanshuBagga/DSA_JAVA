package RecurssionAndBackTracking.BackTracking;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class PermutationOfAnArray {
    public static void main(String[] args){
        int a[] = {1,2,3};
        permutationHelper(a , 0 , a.length-1);
    }
    static void permutationHelper(int a[] , int l , int h){
        if(l == h) {
            printArray(a);
        } // base case
        for(int i = l ; i <= h ; i++){
            swap(a , i , l);
            permutationHelper(a , l+1 , h);
            swap(a , l+1 , h);// backtracking`
        }
    }

    static void printArray(int a[]){
        for(int e: a){
            System.out.print(e + " ");
        }
        System.out.println();
    }

    static void swap(int a[] , int i , int l){
        int temp = a[i];
        a[i] = a[l];
        a[l] = temp;
    }
}
