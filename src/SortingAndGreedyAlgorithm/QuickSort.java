package SortingAndGreedyAlgorithm;

public class QuickSort {
    public static void main(String[] args){
        int a[] = {4,6,2,5,7,9,1,3};
        quickSort(a , 0 , a.length-1);
        for(int X : a){
            System.out.println(X + " ");
        }
        System.out.println();
    }
    static void quickSort(int a[] , int l , int h){
        if(l < h){ // min 2 elements
            int pivot = partitioning(a ,l , h);
            quickSort(a , l , pivot-1);
            quickSort(a , pivot+1 , h);
        }
    }

    static int partitioning(int a[] , int l , int h){
        int pivot = a[l];
        int i = l;
        int j = h;

        while(i <= j){
            while(i < h && a[i] <= pivot) i++;
            while(j >= 0 && a[j] > pivot) j--;
            swap(a , i , j);
        }
        swap(a , l , j);
        return j;
    }

    static void swap(int a[] , int i , int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
