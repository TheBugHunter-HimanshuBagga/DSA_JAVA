package SortingAndGreedyAlgorithm;

public class MergeSort {
    public static void main(String[] args){
        int a[] = {6,12,10,9,1};
        mergeSort(a,0, a.length-1);
        for(int a1 : a){
            System.out.println(a1);
        }
    }
    static void mergeSort(int a[] , int l , int h){
        if(l < h){
            int m = (l+h)/2;
            mergeSort(a, l, m-1);
            mergeSort(a , m , h);
            merge(a , l , m , h);
        }
    }

    static void merge(int a[] , int l , int m , int h){
        int n1 = m-1-l+1; // low to mid-1
        int n2 = h - m+1; // last - first

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i = l ; i < m ; i++){
            L[i] = a[i];
        }
        for(int i = m ; i <= h ; i++){
            R[i] = a[i];
        }

        int i = 0 , j = 0 , k = l;

        while(i < n1 && j <= n2){
             if(L[i] < R[j]){
                a[k] = L[i];
                i++;
             }else{
                 a[k] = R[j];
                 j++;
             }
             k++;
        }
        while(i < m){
            a[k] = L[i];
            i++ ; k++;
        }
        while(j <= h){
            a[k] = R[j];
            j++;
            k++;
        }
    }
}
