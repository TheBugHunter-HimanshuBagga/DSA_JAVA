package SortingAndGreedyAlgorithm;

public class SelectionSort {
    public static void main(String[] args) {
        // selection sort
        // sorted and unsorted array break it
        // starting sorted 0 and unsorted length of array
        //[4,1,8,2,3,7] - 6 idx5
        int a[] = {4,1,8,2,3,7};
        selectionSort(a);
        for(int X : a){
            System.out.println(X + " ");
        }
    }
    static void selectionSort(int a[]){
        int n = a.length;
        for(int i = 0 ; i < n-1 ; i++){
            int min = i;
            for(int j = i+1 ; j < n ; j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }
}
