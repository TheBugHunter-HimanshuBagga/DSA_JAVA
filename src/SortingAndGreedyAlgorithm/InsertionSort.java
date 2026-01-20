package SortingAndGreedyAlgorithm;

public class InsertionSort {
    public static void main(String[] args) {
        int a[] = {9,5,3,0,2};

        insertionSort(a);
        for(int x : a){
            System.out.println(" " + x);
        }
    }

    static void insertionSort(int[] a){
        int n = a.length;
        for(int i = 1 ; i < n ; i++){
            int temp = a[i];
            int swapIdx = i - 1;
            while(swapIdx >= 0 && a[swapIdx] > temp){
                a[swapIdx + 1] = a[swapIdx];
                swapIdx--;
            }
            a[swapIdx + 1] = temp;
        }
    }
}
