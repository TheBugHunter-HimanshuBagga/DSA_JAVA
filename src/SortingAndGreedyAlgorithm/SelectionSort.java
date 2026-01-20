package SortingAndGreedyAlgorithm;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = {9,5,3,1,2};

        selectionSort(a);
        for(int x : a){
            System.out.println(" " + x);
        }
    }

    static void selectionSort(int[] a){
        int n = a.length;

        for(int i = 0 ; i < n - 1 ; i++){
            int minIndex = i;
            for(int j = i+1 ; j < n ; j++ ){
                if(a[j] < a[minIndex]){
                    minIndex = j;
                }
            }
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
    }
}
